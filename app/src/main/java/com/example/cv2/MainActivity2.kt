package com.example.cv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.cv2.EducationFragment
import com.example.cv2.ExperienceFragment

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnEducation: Button
    private lateinit var btnExperience: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        title = "Your Carrer"
        btnExperience = findViewById(R.id.btnExperience)
        btnEducation = findViewById(R.id.btnEducation)

        btnExperience.setOnClickListener(){
            changeFragment(ExperienceFragment(), "Experiences")
        }

        btnEducation.setOnClickListener(){
            changeFragment(EducationFragment(), "Education")
        }
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, ExperienceFragment()).commit()

    }

    private fun changeFragment(fragment: Fragment, name: String) {

        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(name).commit()

    }
}