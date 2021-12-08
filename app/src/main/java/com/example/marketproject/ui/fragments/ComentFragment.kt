package com.example.marketproject.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marketproject.R
import com.example.marketproject.databinding.FragmentComentsBinding

class ComentFragment : Fragment() {

    private var _binding: FragmentComentsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentComentsBinding.inflate(inflater, container, false)
        return binding.root
    }

}