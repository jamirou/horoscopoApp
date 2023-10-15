package com.jamirodev.horoscopoapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jamirodev.horoscopoapp.databinding.ItemHoroscopeBinding
import com.jamirodev.horoscopoapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener {onItemSelected(horoscopeInfo) }
    }
}