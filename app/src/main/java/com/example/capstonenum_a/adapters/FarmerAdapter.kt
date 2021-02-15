package com.example.capstonenum_a.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.capstonenum_a.models.Farmer
import com.example.capstonenum_a.R
import kotlinx.android.synthetic.main.farmerrow.view.*

class FarmerAdapter(val arrayList: ArrayList<Farmer>, val context: Context):
        RecyclerView.Adapter<FarmerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems(farmer: Farmer){
            itemView.nameTV.text= farmer.name
            itemView.locationTV.text= farmer.crops
            itemView.imageIV.setImageResource(farmer.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.farmerrow, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.bindItems(arrayList[position])
        holder.itemView.setOnClickListener{
            val farmer = arrayList.get(position)
            val name: String = farmer.name
            val location: String = farmer.crops
            val image: Int = farmer.image

            /*val intent = Intent(context, RestaurantMenu::class.java)
            intent.putExtra("name",name)
            intent.putExtra("location",location)
            intent.putExtra("image",image)
            context.startActivity(intent)*/
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}