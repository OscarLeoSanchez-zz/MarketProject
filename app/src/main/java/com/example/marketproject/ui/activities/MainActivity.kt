package com.example.marketproject.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import com.example.marketproject.R
import com.example.marketproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setSupportActionBar(binding.toolBarMain)
//
//        val navController = findNavController(R.id.navContentHome)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        binding.bntMenu.setupWithNavController(navController)

    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.navContentAuth)
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }
    fun configNav(){
//        NavigationUI.setupWithNavController(bntMenu, Navigation.findNavController(this, R.id.fragmentContent))
    }
}