package com.akakce.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.akakce.uikit.databinding.MiniHplComponentBinding

/**
 * @Author: Selim Simsek
 * @Date: 15.08.2022
 */
class MiniHplComponent : ConstraintLayout {
    lateinit var binding: MiniHplComponentBinding

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    fun init() {
        val inflater = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
        binding = MiniHplComponentBinding.inflate(inflater, this, true)
        setUI()
    }

    private fun setUI() {
        binding.badge.setBackgroundResource(R.drawable.badge)
    }

}