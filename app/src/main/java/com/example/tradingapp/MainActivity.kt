package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tradingapp.databinding.AchievementCardFirstWeekBinding
import com.example.tradingapp.databinding.ActivityMainBinding
import com.example.tradingapp.databinding.InvestementFirstCardBinding
import com.example.tradingapp.databinding.UserCardBinding

class MainActivity : AppCompatActivity() {

    // Erstellen von ViewBinding Pbject
    private lateinit var binding: ActivityMainBinding
    private lateinit var userCardBinding: UserCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.run {
            this@MainActivity.apply {
                /**
                 * Wir weißen Objekt, was wir oben erstellt haben und ID von included Layout zu
                 * userCardBinding = Objekt
                 * viewUserCard = ID von Included Layout
                 */
                userCardBinding = includeUserCard
            }
        }
        // Hier die Methode aufrufen
        setupCardView()
    }

    private fun setupCardView() {
        userCardBinding.apply {
            amount.text = "1000000"
            currency.text ="€"
        }
    }
}