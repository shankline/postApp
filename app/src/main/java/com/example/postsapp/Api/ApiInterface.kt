package com.example.postsapp.Api

interface ApiInterface {
    import com.example.postsapp.models.Post
    import okhttp3.Response
    import retrofit2.http.GET
    import retrofit2.http.POST

    interface ApiInterface {
        @GET(value = "Posts")
        suspend fun  getPosts(): Response
        <List<Post>>
    }
}