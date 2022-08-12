package com.akakce.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.akakce.uikit.databinding.HplComponentBinding

/**
 * @Author: Selim Simsek
 * @Date: 5.08.2022
 */
class HplComponent : ConstraintLayout {
    lateinit var binding: HplComponentBinding

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
        binding = HplComponentBinding.inflate(inflater, this, true)
        setListener()
    }

    fun setListener() {
        var isFollow = false

        binding.favBtnLayout.setOnClickListener {
            isFollow = !isFollow
        }
        val image = if (isFollow) {
            R.drawable.ic_fav_selected
        } else {
            R.drawable.ic_fav_unselected
        }
        binding.favBtnIcon.setBackgroundResource(image)

    }
}
