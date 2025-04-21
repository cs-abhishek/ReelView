Hi everyone! 👋 We're Abhishek Kumar, Zaara Tahreem, Noorie Parveen, and Amna Hasaan. Our project, ReelView, is a cross-platform movie browsing, and review watching app built using Kotlin Multiplatform and Compose. This project gave us hands-on experience with real-world app development, API integration, UI/UX design, and building for Android, iOS, and desktop using a single codebase. It's been an exciting journey exploring modern development tools and bringing our ideas to life! 🌟🎬
🎬 ReelView
<!-- <p align="center"><img src="assets/logo_notflix.png" alt="ReelView" height="31px"></p> --> <p align="center"> <img src="https://img.shields.io/badge/-KOTLIN-E50914?logo=kotlin&logoColor=white&style=for-the-badge"> <img src="https://img.shields.io/badge/-ANDROID-E50914?logo=android&logoColor=white&style=for-the-badge"> <img src="https://img.shields.io/badge/-IOS-E50914?logo=ios&logoColor=white&style=for-the-badge"> <img src="https://img.shields.io/badge/-DESKTOP-E50914?logo=desktop&logoColor=white&style=for-the-badge"> </p>
ReelView is a Kotlin Multiplatform showcase that utilizes Compose Multiplatform to build apps with unified UI across Android, iOS, and desktop environments (Linux, Windows, macOS). A single codebase is used to develop all platforms.

It integrates the TMDB API for retrieving and presenting film content.

⚠️ This repository is a work in progress. It serves as a demo for Kotlin/Compose Multiplatform basics and is not optimized for production deployment.

📌 Contents
📷 Preview

🚀 Setup

Requirements

Installation Guide

🧰 Tooling

📚 References

🎥 Tutorials

📖 Reading List

🛠️ Example Projects

📷 Preview
Android
<img src="screenshots/android1.png" width="200"/> <img src="screenshots/android2.png" width="200"/> <img src="screenshots/android3.png" width="200"/> <img src="screenshots/android4.png" width="200"/> <img src="screenshots/android5.png" width="200"/> <img src="screenshots/android6.png" width="200"/>

iOS
<img src="screenshots/ios1.png" width="200"/> <img src="screenshots/ios2.png" width="200"/> <img src="screenshots/ios3.png" width="200"/> <img src="screenshots/ios4.png" width="200"/> <img src="screenshots/ios5.png" width="200"/> <img src="screenshots/ios6.png" width="200"/>

Desktop
<img src="screenshots/desktop1.png" width="640"/> <img src="screenshots/desktop2.png" width="640"/>

🚀 Setup
Requirements
Java JDK – for building Android apps.

Android Studio – main IDE used for mobile and desktop projects.

Xcode – required for iOS development.

Kotlin Multiplatform Plugin – install this in Android Studio via Plugins settings.

Installation Guide
Clone the project:

bash
Copy
Edit
git clone -- <Link wil be shared soon>
📱 Android App
Open the project using Android Studio.

Ensure your emulator or real device is connected.

Add your TMDB API key to local.properties:
(Mine Personal TMDB API Key is added in the local.properties file for testing purposes. You can create your own TMDB API key by signing up on the TMDB website.)

properties
Copy
Edit
api_key=<YOUR_TMDB_API_KEY>
Sync and build the app using:

bash
Copy
Edit
./gradlew installDebug
🍏 iOS App
Launch the iOS module with Xcode.

Connect a simulator or physical device.

Build and run the project from Xcode.

🖥️ Desktop App
Open in Android Studio.

Build and launch using:

bash
Copy
Edit
gradlew desktopRun
🏗️ Project Breakdown
There are two primary modules in this app:

1. composeApp
   This module contains the reusable logic and UI code.

androidMain – Android-specific implementations and configurations.

iosMain – Handles iOS-specific logic and app startup routines.

desktopMain – Contains desktop app entry point and platform-specific details.

commonMain – Shared logic used by all platforms:

domain – Core app logic and models.

data – Manages API and cache layers.

ui – Cross-platform UI components via Compose.

di – Dependency injection (Koin).

2. appiOS
   Dedicated module for iOS, bridging the shared logic to native code.

🧰 Tooling
Here are the libraries and tools used:

Kotlin Multiplatform

JetBrains Compose Multiplatform

KotlinX Coroutines

AndroidX DataStore

Koin for dependency injection

kotlinx.serialization

Ktor for HTTP requests

Napier for logging

kotlinx.datetime

Room Database (KMP)

Paging for large data handling

BuildKonfig for config management

Coil3 for image loading

Compose Navigation

KMPalette for color utilities

Ktlint for formatting

Detekt for static analysis

📚 References
🎥 Tutorials
Intro to KMM Development

Code Sharing with KMM

📖 Reading List
Hands-on with Kotlin Multiplatform

KaMPKit Architecture Guide

Integrating Koin with KMM

KMM Getting Started

Beginner Guide to KMP (Part 1-3)

Using Realm in KMM

🛠️ Example Projects
KMM Playground

Fantasy Premier League App (KMM)

KaMPKit Sample

People In Space

Poetree App