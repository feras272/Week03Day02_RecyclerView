package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), CustomAdapter.onItemClickListener {

    lateinit var data:PersonData

    private var recyclerView:RecyclerView? = null
    private var searchFilter:EditText? = null
    //private var selectItem:Button? = null
    val array:ArrayList<Person> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        prepareRecyclerView()

    }



    private fun connectViews() {
        recyclerView = findViewById(R.id.rvContent)
        searchFilter = findViewById(R.id.etFilter)
        //selectItem = findViewById(R.id.openItem)
    }



    private fun prepareRecyclerView() {


        array.add(Person("Feras", R.drawable.profile_pic))
        array.add(Person("Ali", R.drawable.profile_pic))
        array.add(Person("Omar", R.drawable.profile_pic))
        array.add(Person("Khalid", R.drawable.profile_pic))
        array.add(Person("Osama", R.drawable.profile_pic))
        array.add(Person("Mohammad", R.drawable.profile_pic))
        array.add(Person("Fares", R.drawable.profile_pic))
        array.add(Person("Sarah", R.drawable.profile_pic))
        array.add(Person("Somer", R.drawable.profile_pic))
        array.add(Person("Faisal", R.drawable.profile_pic))
        array.add(Person("Feras", R.drawable.profile_pic))
        array.add(Person("Ali", R.drawable.profile_pic))
        array.add(Person("Omar", R.drawable.profile_pic))
        array.add(Person("Khalid", R.drawable.profile_pic))
        array.add(Person("Osama", R.drawable.profile_pic))
        array.add(Person("Mohammad", R.drawable.profile_pic))
        array.add(Person("Fares", R.drawable.profile_pic))
        array.add(Person("Sarah", R.drawable.profile_pic))
        array.add(Person("Somer", R.drawable.profile_pic))
        array.add(Person("Faisal", R.drawable.profile_pic))
        array.add(Person("Feras", R.drawable.profile_pic))
        array.add(Person("Ali", R.drawable.profile_pic))
        array.add(Person("Omar", R.drawable.profile_pic))
        array.add(Person("Khalid", R.drawable.profile_pic))
        array.add(Person("Osama", R.drawable.profile_pic))
        array.add(Person("Mohammad", R.drawable.profile_pic))
        array.add(Person("Fares", R.drawable.profile_pic))
        array.add(Person("Sarah", R.drawable.profile_pic))
        array.add(Person("Somer", R.drawable.profile_pic))
        array.add(Person("Faisal", R.drawable.profile_pic))
        array.add(Person("Feras", R.drawable.profile_pic))
        array.add(Person("Ali", R.drawable.profile_pic))
        array.add(Person("Omar", R.drawable.profile_pic))
        array.add(Person("Khalid", R.drawable.profile_pic))
        array.add(Person("Osama", R.drawable.profile_pic))
        array.add(Person("Mohammad", R.drawable.profile_pic))
        array.add(Person("Fares", R.drawable.profile_pic))
        array.add(Person("Sarah", R.drawable.profile_pic))
        array.add(Person("Somer", R.drawable.profile_pic))
        array.add(Person("Faisal", R.drawable.profile_pic))

        val customerAdapter:CustomAdapter = CustomAdapter(array, this)
        recyclerView?.layoutManager = GridLayoutManager(this,2)
        recyclerView?.adapter = customerAdapter
        //customerAdapter.notifyDataSetChanged()




    }

    override  fun onItemClick(position: Int) {
        val person = array[position]
        Toast.makeText(this,"item ${person.name} clicked",Toast.LENGTH_SHORT).show()
        //val clickedItem = array[position]
        val intent:Intent = Intent(this,ProfileActivity::class.java)
        intent.putExtra("NAME", person.name.toString())
        startActivity(intent)

    }




}