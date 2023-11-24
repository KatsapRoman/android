package com.myappmysps.animalsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myappmysps.animalsapp.data.model.AnimalClass
import com.myappmysps.animalsapp.databinding.ActivityDetailBinding
import com.myappmysps.animalsapp.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@DetailActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!
    private val cat = AnimalClass(
        name = "Cat", description = "You may love your cat,\n" +
                " but you may not be fully aware of just how\n" +
                " cool your she — and her overall species — \n" +
                "really is. For example, did you know that cats\n" +
                " have an extra organ that allows them \n" +
                "to taste scents? Or that they developed\n" +
                " meowing as a way to communicate\n" +
                " exclusively with humans?.  ", R.mipmap.cat
    )
    private val tiger = AnimalClass(
        name = "Tiger",
        description = "After a century of decline, \noverall wild tiger numbers are starting to tick upward.\n Based on the best available information, \ntiger populations are stable or increasing\n in India, Nepal, Bhutan, Russia and China.\n About 5,574 tigers remain in the wild,\n according to the Global Tiger\n Forum, but much more work is needed \nto protect this species if we are \nto secure its future in the wild. . ",
        R.mipmap.tiger
    )
    private val rat = AnimalClass(
        name = "Rat",
        description = "Rats are various medium-sized, long-tailed rodents.\n Species of rats are found throughout the order\n" +
                "  Rodentia, but stereotypical rats are found \n" +
                " in the genus Rattus. Other rat genera include \n" +
                " Neotoma (pack rats), Bandicota \n" +
                " (bandicoot rats) and Dipodomys (kangaroo rats).\n" +
                "\n" +
                "Rats are typically distinguished from mice by their size.\n" +
                "  Usually the common name of a large\n" +
                "  muroid rodent will include the word\n" +
                "  \"rat\", while a smaller muroid's name will\n" +
                "  include \"mouse\". The common terms rat and \n" +
                " mouse are not taxonomically specific.\n" +
                "  There are 56 known species \n" +
                " of rats in the world.[",
        R.mipmap.rat
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        when (intent.getStringExtra("Animal")) {
            "tiger" -> {
                binding.textViewNameDetail.text = tiger.name
                binding.textViewDescriptions.text = tiger.description
                binding.imageViewDetail.setImageResource(tiger.image)

            }

            "cat" -> {
                binding.textViewNameDetail.text = cat.name
                binding.textViewDescriptions.text = cat.description
                binding.imageViewDetail.setImageResource(cat.image)
            }

            "rat" -> {
                binding.textViewNameDetail.text = rat.name
                binding.textViewDescriptions.text = rat.description
                binding.imageViewDetail.setImageResource(rat.image)
            }
        }
    }


}