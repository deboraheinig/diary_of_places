package com.example.placediary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.placediary.databinding.ActivityAddPlaceBinding.inflate
import com.example.placediary.databinding.ActivityMainBinding

class AddPlaceActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_place)

        }
    }
}