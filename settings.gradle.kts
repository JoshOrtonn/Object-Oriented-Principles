plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "ObjectOrientedPrinciples"
include("src:main:NewModule")
findProject(":src:main:NewModule")?.name = "NewModule"
