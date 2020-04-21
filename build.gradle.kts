plugins {
    kotlin("jvm") version "1.3.61"
}

group = "fr.fnovellon"
version = "1.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.junit.jupiter", "junit-jupiter-api", Versions.junit)
    testImplementation("org.junit.jupiter", "junit-jupiter-params", Versions.junit)
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", Versions.junit)
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform()


    }
}

object Versions {
    const val junit: String = "5.4.2"
}