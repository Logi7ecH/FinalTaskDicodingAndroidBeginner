package com.example.finaltaskapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewGameAdapter(private val listGame: ArrayList<Game>):
    RecyclerView.Adapter<CardViewGameAdapter.CardViewViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewGameAdapter.CardViewViewHolder {
        val view: View= LayoutInflater.from(parent.context).inflate(R.layout.item_viewcard_game, parent,false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewGameAdapter.CardViewViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context).load(game.photo).apply(RequestOptions().override(350,550)).into(holder.imgPhoto)
        holder.tvName.text = game.name
        holder.tvRelease.text = game.releaseDate
        holder.tvRating.text = game.rating
        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listGame[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }
        holder.btnDetail.setOnClickListener{
            when(it?.id){
                R.id.layout_button ->{
                    val moveData = Intent(it.context, DetailActivity::class.java)
                    moveData.putExtra(DetailActivity.TITLE, game.name )
                    moveData.putExtra(DetailActivity.IMAGE, game.photo)
                    moveData.putExtra(DetailActivity.RELEASE_DATE, game.releaseDate)
                    moveData.putExtra(DetailActivity.GAME_RATING, game.rating)
                    moveData.putExtra(DetailActivity.GAME_DESC, game.description)
                    it.context.startActivity(moveData)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listGame.size
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto:ImageView = itemView.findViewById(R.id.card_view_img)
        val tvName:TextView = itemView.findViewById(R.id.card_view_title)
        val tvRelease:TextView = itemView.findViewById(R.id.release_date)
        val tvRating: TextView = itemView.findViewById(R.id.rating_game)
        val btnDetail:Button = itemView.findViewById(R.id.layout_button)
        val btnShare: Button = itemView.findViewById(R.id.share_button)
    }

}