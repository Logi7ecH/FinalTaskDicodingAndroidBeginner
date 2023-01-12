package com.example.finaltaskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    private lateinit var rvGames: RecyclerView
    private var list:ArrayList<Game> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_FinalTaskApp)
        setContentView(R.layout.activity_main)

        rvGames= findViewById(R.id.rv_games)
        rvGames.setHasFixedSize(true)
        list.addAll(GamesData.getListData())
        showRecyclerCardView()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(Mode: Int) {
        when(Mode){
            R.id.about_page ->{
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showRecyclerCardView(){
        rvGames.layoutManager = LinearLayoutManager(this)
        val cardViewGameAdapter = CardViewGameAdapter(list)
        rvGames.adapter = cardViewGameAdapter
    }

}