// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}

// Project-level build.gradle.kts
buildscript {
    repositories {
        google() // Add this line if not present
        mavenCentral()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.1")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.8") // Add this line
    }
}
