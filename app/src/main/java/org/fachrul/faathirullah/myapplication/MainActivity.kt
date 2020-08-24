package org.fachrul.faathirullah.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvDishess: RecyclerView
    private var list: ArrayList<Dish> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDishess = findViewById(R.id.rv_dish)
        rvDishess.setHasFixedSize(true)

        list.addAll(DishData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDishess.layoutManager = LinearLayoutManager(this)
        val listDishAdapter = ListDishAdapter(list)
        rvDishess.adapter = listDishAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    fun About(item: MenuItem) {
        val intent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(intent)
        finish()
    }
    }

