package com.example.chuutatsu.ios_app_review

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = Array(20, { i -> "test $i" })
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        itemListView.adapter = adapter
        itemListView.setOnItemClickListener { _, view, _, _ ->
            val textView = view.findViewById<TextView>(android.R.id.text1)
            Toast.makeText(this, "Clicked: ${textView.text}", Toast.LENGTH_SHORT).show()
        }

    }
}
