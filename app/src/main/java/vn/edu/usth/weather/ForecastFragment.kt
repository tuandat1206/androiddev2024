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
        // Tạo LinearLayout lớn làm nền màu xanh dương nhạt
        val mainLayout = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.parseColor("#E0F7FA")) // Màu xanh dương nhạt
            setPadding(16, 16, 16, 16) // Padding cho layout lớn
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }

        // Dữ liệu giả cho các ngày dự báo
        val forecastData = listOf(
            Triple("Mon", "Partly Cloudy", "24C - 31C"),
            Triple("Tue", "Showers", "24C - 30C"),
            Triple("Wed", "Rain", "22C - 23C"),
            Triple("Thu", "Scattered Showers", "22C - 27C"),
            Triple("Fri", "Mostly Cloudy", "24C - 31C"),
            Triple("Sat", "Partly Cloudy", "22C - 30C"),
            Triple("Sun", "Thunderstorms", "25C - 28C")
        )

        // Tạo các hàng dự báo với layout_weight chia đều
        for ((day, condition, temperature) in forecastData) {
            val forecastLayout = LinearLayout(context).apply {
                orientation = LinearLayout.HORIZONTAL
                setPadding(8, 8, 8, 8) // Padding cho mỗi hàng
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    0, 1f // Sử dụng layout_weight để chia đều các hàng
                )
                gravity = Gravity.CENTER_VERTICAL // Căn giữa theo chiều dọc
            }

            // TextView cho ngày
            val dayTextView = TextView(context).apply {
                text = day
                setTextColor(Color.BLACK)
                textSize = 18f
                gravity = Gravity.CENTER
                layoutParams = LinearLayout.LayoutParams(
                    0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f
                )
            }

            // ImageView cho icon thời tiết
            val weatherIcon = ImageView(context).apply {
                setImageResource(R.drawable.disaster) // Sử dụng icon phù hợp
                layoutParams = LinearLayout.LayoutParams(
                    0, 100, 0.5f // Cố định kích thước icon cho đều
                )
            }

            // TextView cho dự báo
            val forecastTextView = TextView(context).apply {
                text = "$condition $temperature"
                setTextColor(Color.BLACK)
                textSize = 16f
                gravity = Gravity.CENTER_VERTICAL
                layoutParams = LinearLayout.LayoutParams(
                    0, LinearLayout.LayoutParams.WRAP_CONTENT, 2f
                )
            }

            // Thêm các view vào layout của từng ngày
            forecastLayout.addView(dayTextView)
            forecastLayout.addView(weatherIcon)
            forecastLayout.addView(forecastTextView)

            // Thêm layout của từng ngày vào layout chính
            mainLayout.addView(forecastLayout)
        }

        return mainLayout
    }
}
