import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.20"
    id("org.jetbrains.dokka") version "1.6.0"
    id("io.gitlab.arturbosch.detekt") version "1.16.0"
    id("org.jmailen.kotlinter") version "3.4.0"
    `maven-publish`
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.6.2")
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.6.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

val dokkaJar by tasks.creating(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    classifier = "javadoc"
    from(tasks.dokka)
}

tasks.detekt {
    detekt {
        input = files("src/*/kotlin")
    }
}

publishing {
    publications {
        create<MavenPublication>("default") {
            from(components["java"])
            artifact(dokkaJar)
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/smyrick/kotlin-extensions")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
