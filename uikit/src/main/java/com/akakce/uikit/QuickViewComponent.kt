package com.akakce.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.akakce.uikit.databinding.QuickViewComponentBinding

/**
 * @Author: Selim Simsek
 * @Date: 20.09.2022
 */
class QuickViewComponent : ConstraintLayout {
    lateinit var binding: QuickViewComponentBinding

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr
    ) {
        init()
    }

    fun init() {
        val inflater = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
        binding = QuickViewComponentBinding.inflate(inflater, this, true)
    }
}