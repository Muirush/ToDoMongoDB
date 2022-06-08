package com.galoppingtech.todomongodb.UI

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.galoppingtech.todomongodb.R
import com.galoppingtech.todomongodb.databinding.FragmentLoginBinding


class login : Fragment(R.layout.fragment_login) {
    private var _binding :FragmentLoginBinding ?= null
    private  val binding get() = _binding !!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLoginBinding.bind(view)
        initViews()
    }

    private fun initViews() {
        binding.lRegister.setOnClickListener(){
            findNavController().navigate(R.id.register)
        }

        binding.materialButton.setOnClickListener(){
            val name = binding.logUsername.text.toString().trim()
            val pwd = binding.logPassword.text.toString().trim()
            if(name.isEmpty()&& pwd.isEmpty()){
                binding.apply {
                    logUsername.error = "cannot be empty"
                    logPassword.error = "Cannot be empty"
                }

            }
            else{
                loginMethod()

            }
        }

    }

    private fun loginMethod() {
        Toast.makeText(activity,"Progressing well", Toast.LENGTH_SHORT).show()
    }

}