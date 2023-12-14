plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "zyuzko.androiddotachallenge"
    compileSdk = 34

    defaultConfig {
        applicationId = "zyuzko.androiddotachallenge"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.lifecycleKit)

    implementation(platform(libs.composeBom))
    implementation(libs.composeActivity)
    implementation(libs.composeUi)
    implementation(libs.composePreview)
    implementation(libs.composeMaterial)
    implementation(libs.composeMaterial3)

    implementation(libs.accompanistSystemUiController)

}
