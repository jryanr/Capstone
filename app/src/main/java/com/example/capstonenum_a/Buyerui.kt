package com.example.capstonenum_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capstonenum_a.adapters.FarmerAdapter
import com.example.capstonenum_a.models.Farmer
import kotlinx.android.synthetic.main.activity_buyerui.*

class Buyerui : AppCompatActivity() {

    var farmerList= ArrayList<Farmer>()
    val displayList= ArrayList<Farmer>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyerui)

        farmerList.add(Farmer(name ="Juan Masipag", crops = "Potatoes, Cabbage, Broccoli", R.mipmap.farmer_male))
        farmerList.add(Farmer(name ="Lea Roxas", crops = "Carrots, Cabbage, Broccoli", R.mipmap.farmer_female))
        farmerList.add(Farmer(name ="Joy Quezon", crops = "Potatoes, Carrots, Cabbage", R.mipmap.farmer_female))
        displayList.addAll(farmerList)

        val rvAdapter = FarmerAdapter(displayList, this)

        farmerRecyclerView.layoutManager = LinearLayoutManager(this)
        farmerRecyclerView.adapter = rvAdapter


    }
}