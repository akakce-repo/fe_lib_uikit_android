package com.akakce.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.akakce.uikit.databinding.BadgeLogoBinding

/**
 * @Author: Selim Simsek
 * @Date: 25.08.2022
 */
class BadgeLogo : ConstraintLayout {
    lateinit var binding: BadgeLogoBinding

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
        binding = BadgeLogoBinding.inflate(inflater, this, true)
    }

}
