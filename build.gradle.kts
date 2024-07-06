plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.0-M2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("org.testng:testng:7.1.0")
    testImplementation ("junit:junit:4.13")
}

tasks.test {
    useJUnitPlatform()
    useTestNG()
    useJUnit()
}