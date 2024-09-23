plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "kotlin_katas"
include("src:main:katas_6")
findProject(":src:main:katas_6")?.name = "katas_6"
