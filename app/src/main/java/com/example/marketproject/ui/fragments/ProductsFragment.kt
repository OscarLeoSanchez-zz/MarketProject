package com.example.marketproject.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.marketproject.R
import com.example.marketproject.ui.listeners.OnProductListener
import com.example.marketproject.ui.adapters.ProductAdapter
import com.example.marketproject.databinding.FragmentProductBinding
import com.example.marketproject.data.model.Product
import com.example.marketproject.ui.viewmodels.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class ProductsFragment : Fragment() {

    private var _binding: FragmentProductBinding? = null
    private val binding get() = _binding!!

    private lateinit var productAdapter: ProductAdapter
    private lateinit var productManager: GridLayoutManager

    private val productViewModel: ProductViewModel by sharedViewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        productViewModel.loadProducts()
        productAdapter = ProductAdapter(
            listOf()
        )
        productAdapter.listener = object: OnProductListener {
            override fun onClick(item: Product) {
                Log.d("Product:  ", item.name)
                productViewModel.selectProduct(item)
                findNavController().navigate(R.id.productDetailFragmentDialog)
            }
        }
        productManager = GridLayoutManager(requireContext(), 1)
        binding.productRv.apply {
            adapter = productAdapter
            layoutManager = productManager
        }
        observeViewModels()
    }

    private fun observeViewModels() {
        productViewModel.products.observe(viewLifecycleOwner, Observer { products ->
            productAdapter.newDataSet(products)
        })
    }
}