package com.example.marketproject.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.marketproject.R
import com.example.marketproject.databinding.FragmentLoginBinding
import com.example.marketproject.isValidEmail
import com.example.marketproject.ui.activities.HomeActivity
import kotlin.math.log


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.buttonLogin.setOnClickListener{
//            requireActivity().finish()
            var isValid = true
            if (!binding.etLoginEmail.text.isValidEmail()){
                isValid = false
                binding.loginEmailLayout.error = "Correo no es válido"
            } else {
                binding.loginEmailLayout.error = null
            }

            if (binding.etLoginPassword.text.toString().length < 3){
                isValid = false
                binding.loginPasswordLayout.error = "Contraseña no válida"
            } else {
                binding.loginPasswordLayout.error = null
            }

//            Log.d("IH", "Estoy aquí")
//            val intent = Intent(context, HomeActivity::class.java)
//            startActivity(intent)

            if (isValid) {
                Log.d("IH", "Estoy aquí")
                val intent = Intent(requireContext(), HomeActivity::class.java)
                startActivity(intent)
            }

        }
        binding.buttonLoginToSignup.setOnClickListener{
            findNavController().navigate(R.id.signUpFragment)
        }
    }



}