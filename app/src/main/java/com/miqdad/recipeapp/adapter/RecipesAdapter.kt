package com.miqdad.recipeapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.miqdad.recipeapp.DetailActivity
import com.miqdad.recipeapp.data.Recipes
import com.miqdad.recipeapp.databinding.RowItemRecipeBinding

class RecipesAdapter(val listRecipes: ArrayList<Recipes>): RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemRecipeBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder (
        RowItemRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listRecipes[position]){
                tvNameRecipes.text = name
                tvCategory.text = category
                tvPrice.text = category
                Glide.with(imgRecipes.context).load(photo).into(imgRecipes)
            }
        }
        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.RECIPES_DATA, listRecipes[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listRecipes.size
}