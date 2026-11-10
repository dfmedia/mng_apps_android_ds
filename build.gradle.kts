// Compile check for the generated tokens and components (GitHub Actions: .github/workflows/compile.yml).
// One Android library: the shared Kotlin + res, and one product flavor per market (tokens/flavors/<flavor>/res),
// so every flavor's resources are linked and every @color/@dimen reference is checked. Not used by the apps.
plugins {
    id("com.android.library") version "8.7.3"
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

val flavorDirs = file("tokens/flavors").listFiles { f -> f.isDirectory }!!.map { it.name }.sorted()

android {
    namespace = "com.mng.designsystem"
    compileSdk = 35
    defaultConfig { minSdk = 24 }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    flavorDimensions += "market"
    productFlavors { flavorDirs.forEach { create(it) { dimension = "market" } } }
    sourceSets {
        getByName("main") {
            manifest.srcFile("build-check/AndroidManifest.xml")
            kotlin.setSrcDirs(listOf("tokens", "components/button/java"))
            res.setSrcDirs(listOf("tokens/res", "components/button/res"))
        }
        flavorDirs.forEach { getByName(it) { res.setSrcDirs(listOf("tokens/flavors/$it/res")) } }
    }
}

kotlin { jvmToolchain(17) }

dependencies {
    implementation("androidx.compose.ui:ui-graphics:1.7.5")          // MngBrandColors.kt, MngSystemColors.kt (Color)
    implementation("com.google.android.material:material:1.12.0")    // mng_button_styles.xml (Widget.MaterialComponents.Button)
}
