plugins {
	java
	id("org.jetbrains.kotlin.plugin.lombok") version "1.6.21"
}

repositories {
	mavenLocal()
	mavenCentral()
	maven(url = "https://repo.runelite.net")
}

val unethicaliteVersion = "1.0.20-EXPERIMENTAL"

dependencies {
	annotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.16")
	annotationProcessor(group = "org.pf4j", name = "pf4j", version = "3.5.0")

	implementation(group = "net.unethicalite", name = "http-api", version = unethicaliteVersion)
	implementation(group = "net.unethicalite", name = "runelite-api", version = unethicaliteVersion)
	implementation(group = "net.unethicalite", name = "runelite-client", version = unethicaliteVersion)

	implementation(group = "org.apache.commons", name = "commons-text", version = "1.9")
	implementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre")
	implementation(group = "com.google.inject", name = "guice", version = "5.0.1")
	implementation(group = "com.google.code.gson", name = "gson", version = "2.8.6")
	implementation(group = "net.sf.jopt-simple", name = "jopt-simple", version = "5.0.4")
	implementation(group = "ch.qos.logback", name = "logback-classic", version = "1.2.3")
	implementation(group = "org.projectlombok", name = "lombok", version = "1.18.16")
	implementation(group = "com.squareup.okhttp3", name = "okhttp", version = "4.9.1")
	implementation(group = "org.pf4j", name = "pf4j", version = "3.6.0")
	implementation(group = "io.reactivex.rxjava3", name = "rxjava", version = "3.1.1")

	implementation(platform("org.lwjgl:lwjgl-bom:3.3.2"))
	implementation(group = "org.lwjgl", name = "lwjgl")
	implementation(group = "org.lwjgl", name = "lwjgl-opengl")
	implementation(group = "org.lwjgl", name = "lwjgl-opencl")

	runtimeOnly(group = "net.runelite.jocl", name = "jocl", version = "1.0", classifier = "macos-x64")
	runtimeOnly(group = "net.runelite.jocl", name = "jocl", version = "1.0", classifier = "macos-arm64")

	runtimeOnly(group = "org.lwjgl", name = "lwjgl", classifier = "natives-linux")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl", classifier = "natives-macos")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl", classifier = "natives-macos-arm64")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl", classifier = "natives-windows-x86")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl", classifier = "natives-windows")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl", classifier = "natives-windows-arm64")

	runtimeOnly(group = "org.lwjgl", name = "lwjgl-opengl", classifier = "natives-linux")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl-opengl", classifier = "natives-macos")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl-opengl", classifier = "natives-macos-arm64")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl-opengl", classifier = "natives-windows-x86")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl-opengl", classifier = "natives-windows")
	runtimeOnly(group = "org.lwjgl", name = "lwjgl-opengl", classifier = "natives-windows-arm64")
	implementation("net.runelite:rlawt:1.4")

	// JUnit for testing
	testImplementation("junit:junit:4.13.2")

	// Mockito for mocking in tests
	testImplementation("org.mockito:mockito-core:3.1.0")

	// RuneLite client and jshell dependencies for testing
	testImplementation("net.unethicalite:runelite-client:$unethicaliteVersion")
	testImplementation("net.unethicalite:runelite-jshell:$unethicaliteVersion")

	// Lombok for compile only and annotation processing in tests
	testImplementation("org.projectlombok:lombok:1.18.20")
	testAnnotationProcessor("org.projectlombok:lombok:1.18.20")
    testImplementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre")
    testImplementation(group = "com.google.inject", name = "guice", version = "5.0.1")
    testImplementation(group = "com.google.code.gson", name = "gson", version = "2.8.6")
    testImplementation(group = "net.sf.jopt-simple", name = "jopt-simple", version = "5.0.4")
    testImplementation(group = "ch.qos.logback", name = "logback-classic", version = "1.2.3")
    testImplementation(group = "org.projectlombok", name = "lombok", version = "1.18.16")
    testImplementation(group = "com.squareup.okhttp3", name = "okhttp", version = "4.9.1")
    testImplementation(group = "org.pf4j", name = "pf4j", version = "3.6.0")
    testImplementation(group = "io.reactivex.rxjava3", name = "rxjava", version = "3.1.1")
    testImplementation("net.runelite:rlawt:1.4")
}

group = "rs117.hd"
version = "1.1.0"