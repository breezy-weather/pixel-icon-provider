plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "org.breezyweather.pixeliconprovider"

    defaultConfig {
        applicationId = "org.breezyweather.pixeliconprovider"
        versionCode = 2
        versionName = "2.0"
    }

    buildTypes {
        named("release") {
            isShrinkResources = false
            isMinifyEnabled = false
            isDebuggable = false
            isCrunchPngs = false // No need to do that, we already optimized them
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        compose = true
        buildConfig = true

        // Disable some unused things
        aidl = false
        renderScript = false
        shaders = false
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    implementation(libs.activity.compose)
}
