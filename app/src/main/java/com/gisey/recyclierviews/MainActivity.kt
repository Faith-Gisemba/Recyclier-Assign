package com.gisey.recyclierviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        rvNumbers = findViewById(R.id.rvNumbers)

        fun fibonacciNumbers(): List<Int> {
            var numbers = mutableListOf(0, 1)
            for (i in 2..99) {
                numbers.add(numbers[i - 1] + numbers[i - 2])
            }
            return numbers
        }

        var number = listOf(1..100)

        val namesAdapter = NamesRvAdapter(number)
        rvNumbers.layoutManager = LinearLayoutManager(this)
        rvNumbers.adapter = namesAdapter
    }

}