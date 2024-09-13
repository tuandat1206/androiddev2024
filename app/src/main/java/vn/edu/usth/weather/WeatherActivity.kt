package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather) // Đảm bảo layout 'activity_weather' tồn tại
        Log.i("WeatherActivity", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("WeatherActivity", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("WeatherActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("WeatherActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("WeatherActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("WeatherActivity", "onDestroy called")
    }
}
