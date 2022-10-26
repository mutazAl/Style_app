package com.example.tradingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.toDrawable
import com.example.tradingapp.R.*
import com.example.tradingapp.R.drawable.safak
import com.example.tradingapp.databinding.AchievementCardFirstWeekBinding
import com.example.tradingapp.databinding.ActivityMainBinding
import com.example.tradingapp.databinding.InvestementFirstCardBinding
import com.example.tradingapp.databinding.UserCardBinding
import com.example.tradingapp.databinding.WelcomeCardBinding

class MainActivity : AppCompatActivity() {

    // Erstellen von ViewBinding Pbject
    private lateinit var binding: ActivityMainBinding
    private lateinit var userCardBinding: UserCardBinding
    private lateinit var welcomeCardBinding: WelcomeCardBinding
    private lateinit var achievementCardFirstWeekBinding: AchievementCardFirstWeekBinding
    private lateinit var investementFirstCardBinding: InvestementFirstCardBinding

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
                welcomeCardBinding = welcomeCard
                achievementCardFirstWeekBinding=achievementsFirstBlock
                investementFirstCardBinding=investementFirstBlock

            }
        }
        // Hier die Methode aufrufen
        setupCardView()
        setupwelcomeCard()
        setupachievementsFirstBlock()
        setupInvestementFirstBlock()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun setupCardView() {
        userCardBinding.apply {
            amount.text = "100 000 000"
            currency.text = "€"
            userImage.setImageDrawable(getDrawable(safak))


        }
    }

    private fun setupwelcomeCard() {
        welcomeCardBinding.welcomeText.text = "Servus"
        welcomeCardBinding.userName.text = "Safak"

    }
private fun setupachievementsFirstBlock(){
    achievementCardFirstWeekBinding.weekNumber.text="20"
    achievementCardFirstWeekBinding.weekNumber.setTextColor(getColor(R.color.white))


}
    private fun setupInvestementFirstBlock(){
        investementFirstCardBinding.imageRestaurant.setImageDrawable(getDrawable(R.drawable.ic_coffee))
    }
}
