package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tradingapp.R.drawable.ic_walk
import com.example.tradingapp.databinding.AchievementCardFirstWeekBinding
import com.example.tradingapp.databinding.ActivityMainBinding
import com.example.tradingapp.databinding.InvestementFirstCardBinding
import com.example.tradingapp.databinding.UserCardBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingCardUser: UserCardBinding
    private lateinit var bindingAchievementCardFirstWeekBinding: AchievementCardFirstWeekBinding
    private lateinit var bindingInvestementFirstCardBinding: InvestementFirstCardBinding
    //vergesen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        title = "__"
        bindingCardUser.money.text = "400"
        bindingAchievementCardFirstWeekBinding.number.text = "20"
        bindingInvestementFirstCardBinding.root.setBackgroundColor(getColor(R.color.green))
        bindingInvestementFirstCardBinding.restaurantWin.text= getString(R.string.restaurant_win)
        bindingInvestementFirstCardBinding.imageRestaurant.setImageDrawable(getDrawable(ic_walk))
    }

    private fun setupBinding() {
        //vergesen
        binding = ActivityMainBinding.inflate(layoutInflater) //initializing the binding class
        binding.run {
            this@MainActivity.apply {
                bindingCardUser = viewUserCard
                bindingAchievementCardFirstWeekBinding = achievementsFirstBlock
                bindingInvestementFirstCardBinding = investementFirstBlock
            }
        }


    }


}