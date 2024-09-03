package com.example.planetsapp

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //1. the view
        listView = findViewById(R.id.listView)

        //2. data source: List<Planet>
        val planet1 = Planet("Mercury", "0 Moons", R.drawable.mercury)
        val planet2 = Planet("Venus", "0 Moons", R.drawable.venus)
        val planet3 = Planet("Earth", "1 Moon", R.drawable.earth)
        val planet4 = Planet("Mars", "2 Moons", R.drawable.mars)
        val planet5 = Planet("Jupiter", "79 Moons", R.drawable.jupiter)
        val planet6 = Planet("Saturn", "83 Moons", R.drawable.saturn)
        val planet7 = Planet("Uranus", "27 Moons", R.drawable.uranus)
        val planet8 = Planet("Nepture", "14 Moons", R.drawable.neptune)

        var planetList = ArrayList<Planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)
        planetList.add(planet8)

        //3. adapter
        var adapter = MyCustomAdapter(this, planetList)
        listView.adapter = adapter
    }
}