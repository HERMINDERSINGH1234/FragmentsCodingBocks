package com.example.sunshine.fragmentscodingbocks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_marvel.view.*

class DCFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.fragment_marvel,container,false)
        val name = arguments?.getString("NAME")
        if (name == "DC")
            view.marvelLv.adapter = ArrayAdapter<String>(
                requireContext(), android.R.layout.simple_list_item_1,
                arrayOf("Wonder Woman", "Superman", "Aquaman", "Batman")
            )
        else if(name == "MARVEL")
            view.marvelLv.adapter = ArrayAdapter<String>(
                requireContext(), android.R.layout.simple_list_item_1,
                arrayOf("Iron Man","Captain America","Thor","Black Panther")
            )


        return view
    }
}