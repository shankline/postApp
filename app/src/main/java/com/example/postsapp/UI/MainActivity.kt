package com.example.postsapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.postsapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val postRepository=PostRepository()
        postViewModelFactory= postViewModelFactory(postRepository)
        postsViewModel=
            ViewModelProvider(Owner: this, postsViewModelFactory).get(PostsViewModel::class.java)
        postsViewModel, getPosts()
        postsViewModel.postsLiveData.observe(Owner; this, Observerrun { postsListl ->
            Toast.makeText(baseContext, Text"${postsListl.Size}posts fetched", Toast.LENGTH_LONG)
                .show()
        })
        postsViewModel,postsFailedLiveData .Observer(Owner:this,Observer{ error ->
            Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
        })
        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"))
        rvNames.adapter = namesAdapter
    }

    private fun NamesRecyclerViewAdapter(listOf: List<String>): Any {
        TODO("Not yet implemented")
    }
}

