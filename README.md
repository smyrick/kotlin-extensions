# kotlin-extensions
[![Build](https://github.com/smyrick/kotlin-extensions/workflows/Build%20master%20branch/badge.svg)](https://github.com/smyrick/kotlin-extensions/actions)

A simple Kotlin library that adds a few extra extensions on top of the Kotlin stdlib.

## 📦 Install

The current version of the library is published to the GitHub Package Registry for this repo.

https://github.com/smyrick/kotlin-extensions/packages

## ⌨️ Usage

This library exposes a few helpful functions that you just need to import. They are mostly [Kotlin extensions functions](https://kotlinlang.org/docs/reference/extensions.html)

```kotlin
import dev.smyrick.kotlin.bool.toNonNull

val nullableBoolean: Boolean? = null

// Without helper
if (nullableBoolean == false || nullableBoolean == null) {
  // Do something
}

// With helper
if (nullableBoolean.toNonNull() == false) {
  // Do something
}
```

## 👥 Contact

This project is currently maintained soley by [@smyrick](https://github.com/smyrick).

If you need to raise an issue or question about this library, please create an issue here and tag it with the appropiate label.

If you need to contact me direc, please see my contact details on my profile page.

## ✏️ Contributing

To get started, please fork the repo and checkout a new branch. You can then build the library locally with the Gradle wrapper

```shell script
./gradlew build
```

See more info in [CONTRIBUTING.md](CONTRIBUTING.md)

## ⚖️ License
This library is licensed under the [MIT License](LICENSE)
