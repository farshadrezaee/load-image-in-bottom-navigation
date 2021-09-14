package com.rz.loadimageinbottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rz.loadimageinbottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userProfileUrl = "https://img.whoispopulartoday.com/Farhad%20Majidi?s=large"

        binding.bottomNavigation.selectedItemId = R.id.home_navigation

        binding.bottomNavigation.loadImage(
            userProfileUrl, R.id.profile_navigation, R.drawable.ic_person
        )

    }

}