# TiktokRepost
 

In this app I tried to create the clean architecture for Android development. The purpose of the project is to repost a tiktok video to our repository.

### Preview:
![listview](https://user-images.githubusercontent.com/70695017/178728043-80f66ff6-231e-40d8-8fcf-16826c77161f.png)
![page1](https://user-images.githubusercontent.com/70695017/178728063-81ce746f-7234-482d-81e1-579146881311.png)

![page2](https://user-images.githubusercontent.com/70695017/178728064-7dc45bd6-eec8-44f0-92da-1904e4d0ee63.png)
![page3](https://user-images.githubusercontent.com/70695017/178728066-f1147153-1f4c-4283-8476-cf14cd6f4853.png)

![popup](https://user-images.githubusercontent.com/70695017/178728071-37e65a82-9086-4a7f-8a6d-b2e242399067.png)
![repostMain](https://user-images.githubusercontent.com/70695017/178728073-d7262e36-e2f2-4000-b6b9-f6eec817bf6e.png)

![settings](https://user-images.githubusercontent.com/70695017/178728075-2755f288-5716-4143-836f-2a9520231449.png)
![share](https://user-images.githubusercontent.com/70695017/178728078-99518016-c48f-4f7f-9e18-c5a98bff1470.png)

![gif1](https://user-images.githubusercontent.com/70695017/178732121-1412085e-14e8-4e20-92c4-1ab1fe1ecac7.gif)
![gif2](https://user-images.githubusercontent.com/70695017/178732847-08d0453e-a2cc-4ed6-9e73-3cbe2ab7d980.gif)

I tried to build this application following these terms. which are:

- performance
- readability
- maintainability
- testability
- scalability
- simplicity

The tools I have used to gain the Android Clean Architecture are:

- MVVM : MVVM architecure is followed for the code boilerplate. Where View, ViewModel, Repisitory are clearly used for maintailed the SOLID principle. (https://www.geeksforgeeks.org/mvvm-model-view-viewmodel-architecture-pattern-in-android/)
- Kotlin (https://kotlinlang.org/)
- Coroutine : To reduce the main thread task we can divide the task in many thread asychronously using the Kotlin Coroutine using lifecycle scope. (https://developer.android.com/kotlin/coroutines)
- Koin : KOIN is a ligh weight dependency injection which is written in pure Kotlin. Its really easy to learn and there is no generated code will be in KOIN used Android project. (https://insert-koin.io/)
- NavigationUI : https://developer.android.com/guide/navigation/navigation-ui
- Kotlin Flow : In coroutines, a flow is a type that can emit multiple values sequentially, as opposed to suspend functions that return only a single value. (https://developer.android.com/kotlin/flow)
- Retrofit : (https://square.github.io/retrofit/)
- view binding : instead of inflating views manually view binding will take care of that.
- Glide : Catch images and load them in imageView.
- Room : Save meals in local database.
