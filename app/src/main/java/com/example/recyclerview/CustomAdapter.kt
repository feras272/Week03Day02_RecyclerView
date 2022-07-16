package com.example.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val array:ArrayList<Person>, val listener: onItemClickListener
):RecyclerView.Adapter<CustomAdapter.DataHolder>() {

//    var countryFilterList = ArrayList<String>()
//
//    init {
//        countryFilterList = countryList
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {

        val vh:DataHolder = DataHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_layout,parent,false))

        return vh

    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
        val person:Person = array.get(position)

//        holder.itemView.setOnClickListener {
//            val intent: Intent = Intent(this,ProfileActivity::class.java)
//            startActivity(intent)
//        }

        holder.imageView.setImageResource(person.profile)
        holder.textView.setText(person.name)



//        val countryHolder = holder as CountryHolder
//        countryHolder.viewBinding.selectCountryText.text = countryFilterList[position]


    }

    override fun getItemCount(): Int {
        return array.size
    }

    // first we added the View.OnClickListener class to our DataHolder inner class
    inner class DataHolder(view:View):RecyclerView.ViewHolder(view),
    View.OnClickListener{
        val imageView:ImageView = view.findViewById(R.id.profileImage)
        val textView:TextView = view.findViewById(R.id.profileText)

        // make init for itemView.setOnClickListener
        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position:Int = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }

        }
    }

    //android:background="@drawable/builder_link_edit_text_border"

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }
}