package com.example.postsapp.viewModel

class PostViewModelFactory
{
    import androidx.lifecycle.MutableLiveData
    import androidx.lifecycle.ViewModel
    import androidx.lifecycle.viewModelScope
    import com.example.postsapp.models.Post
    import com.example.postsapp.repository.PostRepository
    import kotlinx.coroutines.launch
    import kotlin.Suppress as Suppress1

    class PostsViewModel ( val PostsRepository: PostRepository):ViewModel(){
        var postsLiveData = MutableLiveData <List<Post>>()
        var postsFailedLiveData = MutableLiveData<String>()
        fun get Posts(){
            viewModelScope.launch {
                val response =postsRepository.getPosts()
                if (response.isSuccessful){
                    postsLiveData.postValue(response.body())
                }
                else{
                    postsLiveData.postValue(response.body()?.String())
                }

            }
        }
    }
}

private fun Any.body():List<Post> {

}

private fun Any.errorBody():List<Post> {

}

}