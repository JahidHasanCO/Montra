package dev.jahidhasanco.montra.presentation.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import dev.jahidhasanco.montra.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBtn.setOnClickListener {
            it.findNavController()
                .navigate(LoginFragmentDirections.actionLoginFragmentToOnboardingFragment())
        }

        binding.signUp.setOnClickListener {
            it.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignUpFragment())
        }
    }

}