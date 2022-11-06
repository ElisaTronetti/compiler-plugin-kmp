@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("com.gradle.enterprise") version "3.11.1"
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.20"
}

gitHooks {
    commitMsg { conventionalCommits() }
    createHooks()
}

rootProject.name = "compiler-plugin-kmp".toLowerCase()
