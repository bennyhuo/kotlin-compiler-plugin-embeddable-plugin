# Embeddable Plugin for Kotlin Compiler Plugin

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.bennyhuo.kotlin/kotlin-compiler-plugin-embeddable-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.bennyhuo.kotlin/kotlin-compiler-plugin-embeddable-plugin)

This is for Kotlin compiler plugin projects. 

Compiler plugins should provide an embeddable artifact along with the embeddable Kotlin compiler. Use this to simplify the configurations for testing and publishing.

See [Kotlin-Trim-Indent](https://github.com/bennyhuo/Kotlin-Trim-Indent) for usage. 

> Kotlin is continuously stablizing the APIs of Kotlin compiler plugin. And it seems that this project have become useless since Kotlin 1.8 if you have migrated your code to the newer `CompilerPluginRegistrar`.
