package org.fachrul.faathirullah.myapplication

import ListDishAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
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
        val listHeroAdapter = ListDishAdapter(list)
        rvDishess.adapter = listHeroAdapter
    }

    private fun showRecyclerGrid() {
        rvDishess.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridDishAdapter(list)
        rvDishess.adapter = gridHeroAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_grid -> {
                showRecyclerGrid()
            }

            R.id.action_cardview -> {

            }
        }
    }
}
