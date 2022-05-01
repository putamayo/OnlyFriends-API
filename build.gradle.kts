val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.10"
    id ("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "rest.onlyfriends"
version = "0.0.1"
val koin_version = "2.2.3"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}


tasks.create("stage") {
    dependsOn("installDist")
}

//shadowJar {
//    archiveFileName = 'app.jar'
//    manifest {
//        attributes 'Main-Class': mainClassName
//    }
//}

repositories {
    mavenCentral()
}


dependencies {
    implementation("com.github.jengelman.gradle.plugins:shadow:6.1.0")
    implementation("gradle.plugin.com.github.johnrengelman:shadow:7.1.2")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-serialization:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.insert-koin:koin-ktor:$koin_version")
    implementation("org.slf4j:slf4j-api:1.7.36")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
    implementation("com.google.firebase:firebase-admin:8.1.0")

}