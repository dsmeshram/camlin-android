# camlin-android

camlin provide the application overview.

area covered
Application session tracking
Activity details traking
FLow details

Gradle setp for android

```
  dependencies{
     implementation project(":camlin")
  }
```

initialize camlin at the application level

```
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
