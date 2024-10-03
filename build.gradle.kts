plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
    id("jacoco")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

allprojects {
    group = property("app.group").toString()
}

dependencyManagement {
    imports {
        mavenBom(libs.spring.cloud.dependencies.get().toString())
    }
}

dependencies {
    implementation(libs.spring.boot.starter.web)  // Spring Boot 웹 애플리케이션
    compileOnly(libs.lombok)  // Lombok을 컴파일할 때만 사용
    annotationProcessor(libs.lombok)  // Lombok 애노테이션 처리
    annotationProcessor(libs.spring.boot.configuration.processor)  // Spring Boot 설정 애노테이션 처리
    testImplementation(libs.spring.boot.starter.test)  // 테스트를 위한 Spring Boot 의존성
    implementation(libs.h2)  // H2 데이터베이스 의존성
}

// about source and compilation
java {
    sourceCompatibility = JavaVersion.VERSION_17
}

with(extensions.getByType(JacocoPluginExtension::class.java)) {
    toolVersion = "0.8.7"
}

// bundling tasks
tasks.getByName("bootJar") {
    enabled = true
}
tasks.getByName("jar") {
    enabled = false
}
// test tasks
tasks.test {
    ignoreFailures = true
    useJUnitPlatform()
}
