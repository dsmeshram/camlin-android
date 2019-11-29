# camlin-android

camlin provide the application overview.

Area covered

Application session tracking

Activity details traking

FLow details

Gradle setup for android
step1: Add it in your root build.gradle at the end of repositories:
```gradle
  
 allprojects {
	repositories 
	{
		...
		maven { url 'https://jitpack.io' }
	}
}
```

step 2:Add the dependency

```
dependencies 
{
	implementation 'com.github.dsmeshram:camlin-android:0.0.1'
}
```

initialize camlin at the application level

```kotlin
class App : Application(){
    override fun onCreate() {
        super.onCreate()
        Camlin.init(this,"key")
    }

    override fun onTerminate() {
        Camlin.destroy(this)
        super.onTerminate()

    }
}
```
