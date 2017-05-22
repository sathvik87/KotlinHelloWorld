package com.sathvik.kotlinhelloworld.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by sathvik on 2017-05-22.
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}
