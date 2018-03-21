//import org.gradle.api.tasks.bundling.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.30"

    repositories {
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
}

group = "kr.leocat.test"
version = "0.0.1-SNAPSHOT"

apply {
    plugin("java")
    plugin("kotlin")
}

plugins {
    kotlin("jvm") version "1.2.30"
    `maven-publish`
}

val kotlin_version: String by extra

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    compile("khttp:khttp:0.1.0")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.4.1")
    compileOnly("org.projectlombok:lombok:1.16.20")

    compile(kotlinModule("stdlib-jdk8", kotlin_version))
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}

publishing {
    repositories {
        maven {
            // change to point to your repo, e.g. http://my.org/repo
            url = uri("$buildDir/repo")
        }
    }
    (publications) {
        "mavenJava"(MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar)
        }
    }
}
