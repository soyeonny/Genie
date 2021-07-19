package com.example.miliy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.miliy.fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var CalendarFragment = CalendarFragment()
    private var AddFragment = AddFragment()
    private var FolderFragment = FolderFragment()
    private var SettingFragment = SettingFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(CalendarFragment)


        bnv.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.calendar -> replaceFragment(CalendarFragment)
                R.id.folder -> replaceFragment(FolderFragment)
                R.id.add -> replaceFragment(AddFragment)
                R.id.setting -> replaceFragment(SettingFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragments_frame, fragment)
            transaction.commit()
        }
    }
}