buildscript {
    extra["kotlin_plugin_id"] = "com.bnorm.template.kotlin-ir-plugin"
}

plugins {
    kotlin("jvm") version "1.7.10" apply false
    id("org.jetbrains.dokka") version "1.7.10" apply false
    id("com.gradle.plugin-publish") version "1.0.0" apply false
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