plugins {
    application
    kotlin("jvm") version "1.5.10"

}

group = "co.putamayo"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}
    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

        implementation("io.ktor:ktor-server-core:1.6.7")
        implementation("io.ktor:ktor-server-netty:1.6.4")
        implementation("ch.qos.logback:logback-classic:1.2.5")


        implementation("io.ktor:ktor-freemarker:1.6.7")

    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }


