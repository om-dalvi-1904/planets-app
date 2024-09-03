package com.example.planetsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.coroutines.currentCoroutineContext

class MyCustomAdapter(val context: Context, val planets: List<Planet>):BaseAdapter() {
    override fun getCount(): Int {
//        TODO("Not yet implemented")
        return planets.size
    }

    override fun getItem(position: Int): Any {
//        TODO("Not yet implemented")
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
//        TODO("Not yet implemented")
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        TODO("Not yet implemented")
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view:View
        if(convertView === null){
            view = inflater.inflate(R.layout.item_list_layout, parent, false)
        }else{
            view = convertView
        }

        val item = getItem(position) as Planet

        val titleTextView = view.findViewById<TextView>(R.id.planet_name)
        val moonCountTextView = view.findViewById<TextView>(R.id.moon_count_text)
        val moon_image = view.findViewById<ImageView>(R.id.imageView)

        titleTextView.text = item.title
        moonCountTextView.text = item.moonCount
        moon_image.setImageResource(item.imagePlanet)

        return view
    }

}