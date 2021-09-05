plugins {
    kotlin("multiplatform") version "1.5.21"
    id("org.jetbrains.compose") version "1.0.0-alpha1"
}

group = "com.ikanoshiokara"
version = "1.0.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    //maven("https://dl.bintray.com/korlibs/korlibs")
}

kotlin {
    js(IR) {
        browser {
            webpackTask {
                outputFileName = "main.js"
                cssSupport.enabled = true
            }
            runTask {
                outputFileName = "main.js"
                cssSupport.enabled = true
            }
        }
        binaries.executable()
    }

    sourceSets {
        named("jsMain") {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)

                // decompose
                val decomposeVersion = "0.3.1"
                implementation("com.arkivanov.decompose:decompose:$decomposeVersion")
                //implementation("com.arkivanov.decompose:extensions-compose-jetbrains:$decomposeVersion")
            }
        }
    }
}

rootProject.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin::class.java) {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().versions.webpackDevServer.version = "4.0.0-rc.0"
}
