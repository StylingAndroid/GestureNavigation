package com.stylingandroid.gesturenav.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.stylingandroid.gesturenav.R
import kotlinx.android.synthetic.main.fragment_gallery.view.*

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_gallery, container, false).also {
        arguments?.getInt("BottomPadding", 0)?.also { bottomPadding ->
            it.updatePadding(bottom = bottomPadding)
        }
        it.navigation_view.setupWithNavController(findNavController())
    }
}
