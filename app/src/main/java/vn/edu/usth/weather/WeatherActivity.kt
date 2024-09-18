package vn.edu.usth.weather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import androidx.appcompat.widget.Toolbar

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        // Thiết lập Toolbar làm ActionBar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Thêm WeatherFragment vào weatherFragmentContainer nếu chưa có
        if (supportFragmentManager.findFragmentById(R.id.weatherFragmentContainer) == null) {
            val weatherFragment = WeatherFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.weatherFragmentContainer, weatherFragment)
                .commit()
        }

        // Thêm ForecastFragment vào forecastFragmentContainer nếu chưa có
        if (supportFragmentManager.findFragmentById(R.id.forecastFragmentContainer) == null) {
            val forecastFragment = ForecastFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.forecastFragmentContainer, forecastFragment)
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("WeatherActivity", "onStart called")
    }
}
