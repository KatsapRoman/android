package com.myappmysps.animalsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myappmysps.animalsapp.data.model.AnimalClass
import com.myappmysps.animalsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val cat= AnimalClass(name = "Cat", description = "The cat (Felis catus) \n is a domesticated \nspecies of small  \ncarnivorous mammal.",R.mipmap.cat)
    private val tiger= AnimalClass(name = "Tiger", description = "The tiger (Panthera tigris)\n is the largest living\n cat species and \na member of the\n genus Panthera. ",R.mipmap.tiger)
    private val rat= AnimalClass(name = "Rat", description = "Rats are various \nmedium-sized, \nlong-tailed rodents.  ",R.mipmap.rat)

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewName.text=tiger.name
        binding.textViewDescription.text=tiger.description
        binding.imageView.setImageResource(tiger.image)
        binding.textViewNameTwo.text=cat.name
        binding.textViewDescriptionTwo.text=cat.description
        binding.imageViewTwo.setImageResource(cat.image)
        binding.textViewNameThree.text=rat.name
        binding.textViewDescriptionThree.text=rat.description
        binding.imageViewThree.setImageResource(rat.image)
        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "tiger")
            startActivity(intent)
            finish()
        }
        binding.buttonTwo.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "cat")
            startActivity(intent)
            finish()
        }
        binding.buttonThree.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "rat")
            startActivity(intent)
            finish()
        }
    }
}