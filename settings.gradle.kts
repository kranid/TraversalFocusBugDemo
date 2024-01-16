pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            setUrl("C:/androidx/master/androidx/build/support_repo/")
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "TraversalFocusBugDemo"
include(":app")
