plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation ("com.google.android.material:material:1.11.0")
    implementation(libs.firebase.auth)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //数据解析
    implementation ("com.google.code.gson:gson:2.8.9")
    //图片加载
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    //网络请求
    implementation ("com.squareup.okhttp3:okhttp:4.11.0")

    implementation  ("io.github.scwang90:refresh-layout-kernel:2.0.5")//核心必须依赖
    implementation  ("io.github.scwang90:refresh-header-classics:2.0.5")//经典刷新头
    implementation  ("io.github.scwang90:refresh-header-radar:2.0.5")//雷达刷新头
    implementation  ("io.github.scwang90:refresh-header-falsify:2.0.5")//虚拟刷新头
    implementation  ("io.github.scwang90:refresh-header-material:2.0.5") //谷歌刷新头
    implementation  ("io.github.scwang90:refresh-header-two-level:2.0.5") //二级刷新头
    implementation  ("io.github.scwang90:refresh-footer-ball:2.0.5") //球脉冲加载
    implementation  ("io.github.scwang90:refresh-footer-classics:2.0.5") //经典加载


}