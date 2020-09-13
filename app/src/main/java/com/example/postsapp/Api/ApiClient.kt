package com.example.postsapp.Api

object ApiClient {
    import okhttp3.OkHttpClient
    import retrofit2.Retrofit
    import retrofit2.converter.gson.GsonConverterFactory

    object ApiClient {
        var client = OkHttpClient.Builder().build()
        var retrofit
            get() {
                val value: Any = Retrofit.Builder()
                    .baseUrl(//jsonplaceholder.typicode.com/posts)
                        . addConverterFactory (GsonConverterFactory.create())
                    .client(client)
                    .build()
                return value
            }
            set(value) = TODO()

        fun <T> buildService(Service: Class<T>): T{
            return  retrofit.create(Service)
        }

    }

    private fun GsonConverterFactory.client(client: OkHttpClient):  any{
    }
}