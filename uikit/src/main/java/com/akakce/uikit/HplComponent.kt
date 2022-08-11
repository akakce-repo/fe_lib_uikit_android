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
        setListener()
    }

    fun setListener() {
        var isFollow = false
        binding.favBtnLayout.setOnClickListener {
            if (isFollow) {
                binding.favBtnIcon.setBackgroundResource(R.drawable.ic_fav_selected)
            } else {
                binding.favBtnIcon.setBackgroundResource(R.drawable.ic_fav_unselected)
            }
            isFollow = !isFollow
        }

    }


}