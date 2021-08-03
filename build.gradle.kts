plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.32"
    id("org.jetbrains.kotlin.kapt") version "1.4.32"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    id("io.micronaut.application") version "1.5.3"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.4.32"
}

version = "0.1"
group = "com.example"

val kotlinVersion=project.properties.get("kotlinVersion")
repositories {
    mavenCentral()
}

micronaut {
    runtime("netty")
    testRuntime("kotest")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}

dependencies {
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-runtime")
    implementation("javax.annotation:javax.annotation-api")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")

    implementation("io.micronaut:micronaut-validation")
    runtimeOnly("com.oracle.database.jdbc:ojdbc8")
    implementation("io.micronaut.data:micronaut-data-jdbc:2.4.4")
    annotationProcessor("io.micronaut.data:micronaut-data-processor:2.4.4")

    runtimeOnly("io.micronaut.sql:micronaut-jdbc-hikari")
    compileOnly("jakarta.persistence:jakarta.persistence-api:2.2.2")

    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    runtimeOnly("ch.qos.logback:logback-classic")

    compileOnly("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
    annotationProcessor("io.micronaut.openapi:micronaut-openapi:2.5.0")

    testImplementation("io.micronaut.test:micronaut-test-kotest:2.3.7")
    testImplementation("io.mockk:mockk:1.10.5")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:4.3.0")

    testAnnotationProcessor("io.micronaut:micronaut-inject-java")
    annotationProcessor("io.micronaut.openapi:micronaut-openapi:2.5.0")
    annotationProcessor("io.micronaut:micronaut-inject-java")

    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")

}


application {
    mainClass.set("com.example.ApplicationKt")
}
java {
    sourceCompatibility = JavaVersion.toVersion("11")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }


}
