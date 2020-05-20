package dev.smyrick.kotlin.bool

/**
 * Converts a nullable Boolean into non-null
 *
 * ### Example ffsd
 * ```kotlin
 * val trueBool: Boolean? = true
 * val falseBool: Boolean? = false
 * val nullBool: Boolean? = null
 *
 * assertTrue(trueBool.toNonNull())
 * assertFalse(falseBool.toNonNull())
 * assertFalse(nullBool.toNonNull())
 * ```
 */
fun Boolean?.toNonNull() = this == true
