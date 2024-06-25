package com.akirachix.article

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.article.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvReader.layoutManager = LinearLayoutManager(this)
        displayAuthors()


    }

    fun displayAuthors() {
        val article1 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article2 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article3 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article4 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article5 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article6 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article7 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article8 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article9 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")
        val article10 = Article("Trevor Noah", "Born A Crime", "Yes", "", "", "12/02/2024", "kadc")


        val articleList = listOf(article1, article2,article3, article4,article5, article6,article7,article9, article10)
        val articleAdapter = ArticleAdapter(articleList)

        binding.rvReader.adapter = articleAdapter


    }


}