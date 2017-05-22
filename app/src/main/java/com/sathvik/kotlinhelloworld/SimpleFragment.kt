package com.sathvik.kotlinhelloworld

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sathvik.kotlinhelloworld.common.inflate
import kotlinx.android.synthetic.main.fragment_simple.*

/**
 * Created by sathvik on 2017-05-22.
 */

class SimpleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_simple)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment_text.text= "This text was set dynamically in the code."
    }
}
