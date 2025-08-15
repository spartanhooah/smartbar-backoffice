plugins {
    java
    id("io.quarkus")
    id("com.diffplug.spotless") version "7.2.1"
    id("io.freefair.lombok") version "8.14"
    id("org.openapi.generator") version "7.14.0"
}

repositories {
    mavenCentral()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-rest-jackson")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-rest")
    implementation("io.quarkus:quarkus-hibernate-validator")
    implementation("io.quarkus:quarkus-hibernate-orm")
    implementation("io.quarkus:quarkus-jdbc-postgresql")
    implementation("io.quarkus:quarkus-config-yaml")

    implementation("org.apache.commons:commons-lang3:3.18.0")

    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
}

group = "net.frey"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}

spotless {
    java {
        palantirJavaFormat()
        removeUnusedImports()
        removeWildcardImports()
    }
}

tasks.compileJava {
    dependsOn("spotlessApply")
}

tasks.quarkusDev {
    dependsOn("spotlessApply")
}

tasks.openApiGenerate {
    generatorName = "jaxrs-spec"
    inputSpec = "src/main/resources/openapi/backoffice-openapi.yaml"
    outputDir = "$rootDir"
    apiPackage = "net.frey.smartbar.backoffice.api.resource"
    modelPackage = "net.frey.smartbar.backoffice.api.model"
    configOptions.put("sourceFolder", "src/main/java")
    configOptions.put("useJakartaEe", "true")
    configOptions.put("useSwaggerAnnotations", "false")
    configOptions.put("interfaceOnly", "true")
    configOptions.put("returnResponse", "true")
}