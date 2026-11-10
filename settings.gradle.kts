// Compile check only (GitHub Actions: .github/workflows/compile.yml). Not used by the apps.
// The generated files stay where Style Dictionary writes them (tokens/, components/).
pluginManagement {
    repositories { google(); mavenCentral(); gradlePluginPortal() }
}
dependencyResolutionManagement {
    repositories { google(); mavenCentral() }
}
rootProject.name = "mng-android-design-system"
