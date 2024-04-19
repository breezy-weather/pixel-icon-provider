plugins {
    id("com.android.application") version "8.3.2" apply false
    kotlin("android") version "1.9.23" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
