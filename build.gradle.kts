plugins {
    `kotlin-dsl`
    id("com.vanniktech.maven.publish") version "0.22.0"
}

repositories {
    maven("https://mirrors.tencent.com/nexus/repository/maven-public")
}

dependencies {
    implementation("com.github.jengelman.gradle.plugins:shadow:6.1.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
}

gradlePlugin {
    plugins {
        create("EmbeddablePlugin") {
            id = "com.bennyhuo.kotlin.plugin.embeddable"
            displayName = "Gradle plugin for embeddable Kotlin compiler plugin"
            description = "Gradle plugin for embeddable Kotlin compiler plugin"
            implementationClass = "com.bennyhuo.kotlin.plugin.embeddable.EmbeddablePlugin"
        }

        create("EmbeddableTestPlugin") {
            id = "com.bennyhuo.kotlin.plugin.embeddable.test"
            displayName = "Gradle plugin for testing embeddable Kotlin compiler plugin"
            description = "Gradle plugin for testing embeddable Kotlin compiler plugin"
            implementationClass = "com.bennyhuo.kotlin.plugin.embeddable.EmbeddableTestPlugin"
        }
    }
}

group = project.property("GROUP").toString()
version = project.property("VERSION_NAME").toString()