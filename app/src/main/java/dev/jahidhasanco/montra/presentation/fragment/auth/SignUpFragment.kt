package dev.jahidhasanco.montra.presentation.fragment.auth

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat.getColor
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dev.jahidhasanco.montra.R
import dev.jahidhasanco.montra.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val terms1: String = getColoredSpanned("By signing up, you agree to the", "#91919F")
        val terms2: String = getColoredSpanned("Terms of Service and Privacy Policy", "#7F3DFF")

        binding.termsCheck.text = Html.fromHtml("$terms1 $terms2")

        binding.backBtn.setOnClickListener {
            it.findNavController().navigate(SignUpFragmentDirections.actionSignUpFragmentToOnboardingFragment())
        }

        binding.login.setOnClickListener {
            it.findNavController().navigate(SignUpFragmentDirections.actionSignUpFragmentToLoginFragment())
        }
    }

    private fun getColoredSpanned(text: String, color: String): String {
        return "<font color=$color>$text</font>"
    }



}