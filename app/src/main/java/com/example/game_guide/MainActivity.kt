package com.example.game_guide

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

const val EXTRA_MESSAGE = "com.example.Game_Guide.MESSAGE"


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId){
                R.id.action_Home -> {
                    val homeFragment = HomeFragment.newInstance()
                    openFragment(homeFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_Fighterz ->{
                    val fighterzFragment = FighterzFragment.newInstance()
                    openFragment(fighterzFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_Mechanics ->{
                    val mechanicsFragment = MechanicsFragment.newInstance()
                    openFragment(mechanicsFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_Glossary -> {
                    val glossaryFragment = GlossaryFragment.newInstance()
                    openFragment(glossaryFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_Misc -> {
                    val miscFragment = MiscFragment.newInstance()
                    openFragment(miscFragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
        false
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        var toolbar: ActionBar = supportActionBar!!

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val homeFragment = HomeFragment.newInstance()
        openFragment(homeFragment)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener)

    }

}
