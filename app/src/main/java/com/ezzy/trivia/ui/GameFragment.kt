package com.ezzy.trivia.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ezzy.trivia.R
import com.ezzy.trivia.databinding.FragmentGameBinding


class GameFragment : Fragment() {

    private var _binding : FragmentGameBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameBinding.inflate(
            inflater, container, false
        )

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}