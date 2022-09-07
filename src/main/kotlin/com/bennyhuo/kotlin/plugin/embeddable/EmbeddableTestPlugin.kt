package com.bennyhuo.kotlin.plugin.embeddable

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by benny.
 */
class EmbeddableTestPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.createEmbedded()
        target.afterEvaluate {
            target.testWithEmbedded()
        }
    }
}