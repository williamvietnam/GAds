package com.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.databinding.ActivityMainBinding
import com.android.test.DemoFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var fragment: DemoFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragment = DemoFragment()

        supportFragmentManager.beginTransaction().add(
            binding.fragmentContainerView.id,
            fragment,
            DemoFragment::class.java.name
        ).addToBackStack(null).commit()
    }
}