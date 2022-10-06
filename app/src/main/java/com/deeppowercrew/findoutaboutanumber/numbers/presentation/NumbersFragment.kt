package com.deeppowercrew.findoutaboutanumber.numbers.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import com.deeppowercrew.findoutaboutanumber.R
import com.deeppowercrew.findoutaboutanumber.details.presentation.DetailsFragment

class NumbersFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_numbers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ProgressBar>(R.id.progressBar).visibility = View.GONE

        view.findViewById<View>(R.id.getFactButton).setOnClickListener {
            val detailsFragment = DetailsFragment()
            detailsFragment.arguments = Bundle().apply {
                putString("details", "Some information about the random number hardcoded")
            }

            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.container, detailsFragment)
                .addToBackStack(detailsFragment.javaClass.simpleName)
                .commit()
        }
    }

    override fun onDetach() {
        super.onDetach()
    }
}