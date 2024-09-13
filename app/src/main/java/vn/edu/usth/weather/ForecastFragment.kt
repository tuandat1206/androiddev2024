package vn.edu.usth.weather

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ForecastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forecast, container, false)

        // Thiết lập màu nền cho Fragment
        view.setBackgroundColor(Color.parseColor("#20FF0000")) // Đổi màu tùy thích

        return view
    }
}
