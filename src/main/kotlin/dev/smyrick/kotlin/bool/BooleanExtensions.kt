package dev.smyrick.kotlin.bool

/**
 * Converts a nullable Boolean into non-null
 *
 *  - true -> true
 *  - false -> false
 *  - null -> false
 */
fun Boolean?.toNonNull() = this == true
