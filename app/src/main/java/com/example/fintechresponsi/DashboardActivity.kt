package com.example.fintechresponsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fintechresponsi.fragments.HistoryFragment
import com.example.fintechresponsi.fragments.HomeFragment
import com.example.fintechresponsi.fragments.PaymentFragment
import com.example.fintechresponsi.fragments.SettingFragment
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val paymentFragment = PaymentFragment()
    private val historyFragment = HistoryFragment()
    private val settingFragment = SettingFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        replaceFragment(homeFragment)

        bottomNav.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_payment -> replaceFragment(paymentFragment)
                R.id.ic_history -> replaceFragment(historyFragment)
                R.id.ic_setting -> replaceFragment(settingFragment)
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_fragment, fragment)
            transaction.commit()
        }
    }
}