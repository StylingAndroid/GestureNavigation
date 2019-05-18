package com.stylingandroid.gesturenav.ui.home

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import androidx.core.view.ViewCompat

class MyCustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val boundingBox: Rect = Rect()
    private val exclusions = listOf(boundingBox)

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        if (changed) {
            boundingBox.set(left, top, right, bottom)
            ViewCompat.setSystemGestureExclusionRects(this, exclusions)
        }
    }
}
