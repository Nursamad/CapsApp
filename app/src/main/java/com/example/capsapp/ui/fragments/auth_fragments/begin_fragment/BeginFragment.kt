package com.example.capsapp.ui.fragments.auth_fragments.begin_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.capsapp.R
import com.example.capsapp.databinding.FragmentBeginBinding

class BeginFragment : Fragment() {

    private lateinit var binding: FragmentBeginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentBeginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnClick()
    }

    private fun btnClick() {
        binding.btnSignIn.setOnClickListener {
           findNavController().navigate(R.id.action_beginFragment_to_loginFragment)
        }
        binding.btnRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_beginFragment_to_registerFragment)
        }
    }
}