package vn.edu.usth.weather

import android.os.Bundle
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
        // Tạo LinearLayout dọc
        val linearLayout = LinearLayout(context)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        // Tạo TextView cho ngày
        val textView = TextView(context)
        textView.text = "Thursday"
        textView.textSize = 18f
        textView.setPadding(16, 16, 16, 16)

        // Tạo ImageView cho icon thời tiết
        val imageView = ImageView(context)
        imageView.setImageResource(R.drawable.disaster) // Đảm bảo tên 'disaster' là tên mới đã đổi
        imageView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        // Thêm TextView và ImageView vào LinearLayout
        linearLayout.addView(textView)
        linearLayout.addView(imageView)

        // Trả về LinearLayout như View cho Fragment
        return linearLayout
    }
}
