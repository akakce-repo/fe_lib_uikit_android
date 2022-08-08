package com.akakce.uikit

import android.content.Context
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.akakce.uikit.databinding.HplComponentBinding

/**
 * @Author: Selim Simsek
 * @Date: 5.08.2022
 */
class HplComponent(context: Context) : ConstraintLayout(context) {
    lateinit var binding: HplComponentBinding

    init {
        init()
    }

    fun init() {
        val inflater = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
        binding = HplComponentBinding.inflate(inflater, this, true)
    }

}