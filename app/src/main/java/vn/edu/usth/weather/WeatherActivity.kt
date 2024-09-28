package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.widget.Toast

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu) // Tải menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_refresh -> {
                Toast.makeText(this, "Refreshing...", Toast.LENGTH_SHORT).show() // Hiển thị toast
                true
            }
            R.id.action_settings -> {
                // Khởi động PrefActivity
                val intent = Intent(this, PrefActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("WeatherActivity", "onStart called")
    }
}
