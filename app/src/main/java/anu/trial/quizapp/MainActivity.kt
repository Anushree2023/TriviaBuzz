package anu.trial.quizapp

import android.content.Intent
import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import anu.trial.quizapp.databinding.ActivityMainBinding

lateinit var Binding:ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)


        Binding.start.setOnClickListener()
        {
            if(Binding.name.text.toString().isEmpty())
            {
                Toast.makeText(this,"Pleast enter the text",Toast.LENGTH_SHORT).show()
            }
            else
            {
                startActivity(Intent(this,MainActivity2::class.java))
                finish()
            }
        }
    }
}