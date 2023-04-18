# HILT

https://user-images.githubusercontent.com/62751830/232761445-c43d3aaa-5da5-4b64-a970-7a0ae0a34507.mp4

The above video displays what this project is going to look like.

// TODO: To be written
Listing down the steps to get a basic HILT setup in your project -> 
* Add dependancies (Checkout the build.gradle files for both app and module)
* Create an Application class and add the @HiltAndroidApp annotation before class declaration (See class MyApplication.kt)
* The main use case of HILT Dependancy Injection is to not manually add dependancies and let the HILT take care of it automatically. 
How did I setup -> 
Added @AndroidEntryPoint annotation before declaring my class (MainActivity.kt)
Added @HiltViewModel annotation before declaring ViewModel. (HiltViewModel.kt)
Now, this ViewModel class uses TextChangeRepo as it's dependancy. 


Point to Note : HILT doesn't provide dependancies for interfaces and or any external library class.

