package com.example.marketproject.ui.fragments

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.marketproject.R
import com.example.marketproject.databinding.FragmentProductDetailBinding
import com.example.marketproject.ui.viewmodels.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import java.lang.NumberFormatException


class ProductDetailFragment : Fragment() {
    private var _binding: FragmentProductDetailBinding? = null
    private val binding get() = _binding!!

//    private val productViewModel: ProductViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

//    override fun onStart() {
//        super.onStart()
//        observeViewModels()
//    }

//    private fun observeViewModels() {
//        Log.d("Err", productViewModel.toString())
//        productViewModel.selected.observe(viewLifecycleOwner, Observer { product ->
//            binding.detailProductName.text = product.name
//            binding.detailProductDescription.text = product.description
//            binding.detailProductPrice.text = product.price
//            Glide.with(binding.root).load(product.image).into(binding.detailProductImage)
//            try {
//                val stock = product.stock.toInt()
//                if (stock > 0) {
//                    binding.detailProductStock.text = "En existencia " + product.stock
//                } else {
//                    binding.detailProductStock.setTextColor(Color.parseColor("##D63F3F"))
//                    binding.detailProductStock.text = "Agotado"
//                }
//            } catch (nfe: NumberFormatException){
//                Log.d("Error: ", "No se puede convertir el número")
//            }
//
//        })
//    }


}