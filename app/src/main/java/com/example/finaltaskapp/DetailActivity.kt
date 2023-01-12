package com.example.finaltaskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    companion object{
        const val TITLE = "title"
        const val IMAGE = "image"
        const val RELEASE_DATE = "release_Date"
        const val GAME_RATING = "rating_game"
        const val GAME_DESC = "desc"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val titleReceived: TextView = findViewById(R.id.detail_title)
        val imgReceived: ImageView = findViewById(R.id.img_detail)
        val dateReceived: TextView = findViewById(R.id.detail_release)
        val ratingReceived: TextView = findViewById(R.id.detail_rating)
        val descReceived: TextView = findViewById(R.id.detail_description)


        val image = intent.getIntExtra(IMAGE,0)
        val title = intent.getStringExtra(TITLE)
        val date = intent.getStringExtra(RELEASE_DATE)
        val rating = intent.getStringExtra(GAME_RATING)
        val desc = intent.getStringExtra(GAME_DESC)

        titleReceived.text = title
        imgReceived.setImageResource(image)
        dateReceived.text = date
        ratingReceived.text = rating
        descReceived.text = desc

        supportActionBar?.title = title

    }
}