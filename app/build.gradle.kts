// App-level build.gradle file
plugins {
    id ("com.android.application")
    id ("com.google.gms.google-services") // Google services plugin
    id ("com.google.firebase.crashlytics") // Firebase Crashlytics plugin
}

android {
    namespace = "com.example.whatsappclone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.whatsappclone"
        minSdk = 23
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

    lint {
        warningsAsErrors = true
        abortOnError = true
    }



    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {


    implementation (platform("com.google.firebase:firebase-bom:33.2.0")) // Firebase BoM

    // Android and Firebase libraries
    implementation ("com.google.firebase:firebase-crashlytics")
    implementation ("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-analytics")
    implementation ("com.google.firebase:firebase-database")
    implementation ("com.google.firebase:firebase-storage")
    implementation ("com.google.firebase:firebase-messaging")
    implementation ("com.google.firebase:firebase-functions")

    // UI and support libraries
    implementation ("androidx.appcompat:appcompat:1.3.1")
    implementation ("com.google.android.material:material:1.4.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("androidx.browser:browser:1.3.0")

    // Additional libraries
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("com.github.bumptech.glide:glide:4.11.0")
    implementation ("com.firebaseui:firebase-ui-database:8.0.0")
    implementation ("com.firebaseui:firebase-ui-auth:8.0.0")
    implementation ("com.firebaseui:firebase-ui-storage:8.0.0")
    implementation(libs.activity)

    //additional libraries 2
    implementation ("com.github.ictfoysal:Android-Image-Cropper-byFt:2.9")
    implementation("com.github.bumptech.glide:glide:4.12.0")
    androidTestImplementation(libs.espresso.contrib)
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")


    // Testing libraries
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.2.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.6.1")
}
