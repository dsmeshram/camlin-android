# camlin-android

camlin provide the application overview.

Area covered

Application session tracking

Activity details traking

FLow details

Gradle setup for android

```gradle
  dependencies{
     implementation project(":camlin")
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
