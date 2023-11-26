plugins {
    kotlin("multiplatform") version "1.9.21"
    application
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

kotlin {
    js {
        useEsModules()
        browser {
            commonWebpackConfig(Action {
                outputFileName = "index.js"
            })
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            val wrappersVersion = extra["kotlin.wrappers.version"]

            dependencies {
                implementation(project.dependencies.enforcedPlatform(kotlinw("wrappers-bom:$wrappersVersion")))
                implementation(kotlinw("react"))
                implementation(kotlinw("react-dom"))
                implementation(kotlinw("emotion"))
                implementation(kotlinw("tanstack-react-query"))
                implementation(kotlinw("tanstack-react-table"))
            }
        }
    }
}

tasks.wrapper {
    gradleVersion = "8.3"
}