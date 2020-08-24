package org.fachrul.faathirullah.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ListDishAdapter(val listDish: ArrayList<Dish>) : RecyclerView.Adapter<ListDishAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_dish, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val dish = listDish[position]
        Glide.with(holder.itemView.context)
            .load(dish.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = dish.name
        holder.tvDetail.text = dish.detail

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.context, DescActivity::class.java)
            val bundle = Bundle()
            bundle.putString("nama", dish.name)
            bundle.putString("deskripsi", dish.name)
            bundle.putInt("gambar", dish.photo)
            intent.putExtras(bundle)
            holder.context.startActivity(intent)
            Toast.makeText(
                holder.itemView.context,
                "" + listDish.get(holder.adapterPosition).name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return listDish.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var context : Context = itemView.context
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}