package com.vishnevskiypro.realtimeexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.vishnevskiypro.realtimeexperiment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val database = Firebase.database
            val myRef = database.getReference("message")
            myRef.setValue("Hello, World!")
            Log.d("AAAAA", "Database: $database myRef: $myRef ")

        }
    }
}
