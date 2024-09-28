package vn.edu.usth.weather

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class ForecastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Tạo LinearLayout làm nền
        val mainLayout = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#E0F7FA")) // Màu nền
            setPadding(16, 16, 16, 16) // Padding cho layout
            gravity = Gravity.CENTER // Căn giữa layout
        }

        // Dữ liệu cho thời tiết
        val temperature = "12°C"
        val condition = "Cloudy"

        // Tạo layout cho biểu tượng thời tiết
        val weatherLayout = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER // Căn giữa
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        // ImageView cho icon thời tiết
        val weatherIcon = ImageView(context).apply {
            setImageResource(R.drawable.cloud) // Sử dụng biểu tượng thời tiết
            layoutParams = LinearLayout.LayoutParams(200, 200) // Kích thước icon
        }

        // TextView cho nhiệt độ
        val temperatureTextView = TextView(context).apply {
            text = temperature
            setTextColor(Color.BLACK)
            textSize = 32f // Kích thước chữ cho nhiệt độ
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        // TextView cho mô tả thời tiết
        val conditionTextView = TextView(context).apply {
            text = condition
            setTextColor(Color.BLACK)
            textSize = 24f // Kích thước chữ cho mô tả
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        // Thêm các view vào layout thời tiết
        weatherLayout.addView(weatherIcon)
        weatherLayout.addView(temperatureTextView)
        weatherLayout.addView(conditionTextView)

        // Thêm layout thời tiết vào layout chính
        mainLayout.addView(weatherLayout)

        return mainLayout
    }
}
