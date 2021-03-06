package com.sumeyra.animation3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.sumeyra.animation3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding :FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnSecondFragment.setOnClickListener {
            val direction = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
            findNavController().navigate(direction)
        }
        binding.btnSecondBack.setOnClickListener {
            val direction = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            findNavController().navigate(direction)
        }








    }


}