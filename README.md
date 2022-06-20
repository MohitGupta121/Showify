# Showify

[![Build](https://github.com/MohitGupta121/Showify/workflows/Build/badge.svg?branch=main)](https://github.com/MohitGupta121/Showify/actions?query=workflow%3ABuild)
[![Lint](https://github.com/hellosagar/AssigmentHub/workflows/Lint/badge.svg?branch=main)](https://github.com/hellosagar/AssigmentHub/actions?query=workflow%3ALint)


[![GitHub license](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
![Twitter Follow](https://img.shields.io/twitter/follow/Mohit_Gupta121?label=Follow&style=social)

**Showify** is a my first simple ✅ Android application 📱, where I learn how to use dagger-hilt, retrofit2, mvvm, livedata, Requestly Interceptor and so much more...

***You can Install and test Showify app from below 👇***

[![Disease Detection](https://img.shields.io/badge/DiseaseDetection✅-APK-red.svg?style=for-the-badge&logo=android)](https://github.com/MohitGupta121/DiseaseDetection/suites/6711576160/artifacts/255441035)

## ⚙️ Features
* Show all latest, upcoming TV shows from [TV Maze](tvmaze.com)

## 🚀 Technology Used

* Showify built using Kotlin
* MVVM Architecture Android
* Dependency Injection (Dagger-Hilt) 
* View and Data Binding
* Retrofit2 , OkHttpclient
* Livedata
* Coroutine Lifecycle Scopes 
* Requestly Interceptor

## 📸 Screenshots

||||
|:----------------------------------------:|:-----------------------------------------:|:-----------------------------------------: |
| ![diseasedetection](https://user-images.githubusercontent.com/76530270/171112927-78ed3aa4-2fdc-42e8-9be4-e842aee7733c.jpg) | ![Screenshot_2022-05-31-12-23-27-332_com android camera](https://user-images.githubusercontent.com/76530270/171113244-c10be32c-c473-49fa-9263-f5f3c613d407.jpg) | ![Screenshot_2022-05-31-12-22-58-343_com example diseasedetection](https://user-images.githubusercontent.com/76530270/171113116-43214846-5c3e-4600-9341-07adfe5644d0.jpg) | 


## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
- [Retrofit](https://square.github.io/retrofit/) - Retrofit is a type-safe REST client for Android, Java and Kotlin developed by Square. The library provides a powerful framework for authenticating and interacting with APIs and sending network requests with OkHttp.
- [Coroutine Lifecycle Scopes](https://developer.android.com/topic/libraries/architecture/coroutines) - Its helps you to manage when your coroutines should run. Each asynchronous operation runs within a particular scope.
- [Requestly Interceptor](https://requestly.io/) - Requestly Android Interceptor lets you debug your android apps without needing you to setup any proxies or install any certificates everytime. All it requires is a one time setup of 3 lines of code.


# Package Structure
    
    com.mohit.showify    # Root Package
    .
    ├── data                # For data handling.
    │   └── repository      # Single source of data.   
    |
    ├── di                  # Dependency Injection             
    |
    ├── ui                  # Activity/View layer
    │   ├── viewmodel       # ViewModels
    │   └── adapter         # Adpaters
    │   └── fragment        # Fragnents
    |
    └── utils               # Utility Classes / Kotlin extensions
   
       
## Architecture
This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.

![architecture](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

## License
```
MIT License

Copyright (c) 2022 Mohit Gupta

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
