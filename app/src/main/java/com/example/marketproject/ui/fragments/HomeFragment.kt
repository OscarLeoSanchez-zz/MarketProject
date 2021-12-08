package com.example.marketproject.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.marketproject.R
import com.example.marketproject.databinding.FragmentHomeBinding
import com.example.marketproject.ui.viewmodels.StoreViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val storeViewModel: StoreViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        storeViewModel.loadInfo()
        observeViewModels()
    }

    private fun observeViewModels() {
        storeViewModel.info.observe(viewLifecycleOwner, Observer { info ->
            binding.homeStoreName.text = info.name
            binding.homeStoreAddress.text = info.address
            binding.homeStoreDescription.text = info.description
            Glide.with(binding.root).load(info.image).into(binding.homeStoreImage)
        })
    }

}