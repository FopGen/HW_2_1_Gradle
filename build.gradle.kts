plugins {
    id("java")
}

group = "org.example"
//version = "1.0-SNAPSHOT"
version = "1.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.code.gson:gson:2.10.1")
}
tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }

    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}
tasks.test {
    useJUnitPlatform()
}