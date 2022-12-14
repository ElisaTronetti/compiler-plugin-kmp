buildscript {
    extra["kotlin_plugin_id"] = "com.etronetti.compiler-plugin-kmp"
}

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("jvm") version "1.7.10" apply false
    id("com.github.gmazzo.buildconfig") version "3.1.0" apply false
    kotlin("multiplatform") version "1.7.10" apply false
}

allprojects {
    group = "com.etronetti"
    version = "0.1.0"
}

subprojects {
    repositories {
        mavenCentral()
    }
}