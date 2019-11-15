package dev.smyrick.kotlin.collections

/**
 * Returns true if the `item` is NOT in the collection, otherwise returns false
 *
 * ### Example
 * ```kotlin
 * val list = listOf(1)
 * assertTrue(list.doesNotContain(2))
 * assertFalse(list.doesNotContain(1))
 * ```
 */
fun <T> Collection<T>.doesNotContain(item: T): Boolean = this.contains(item).not()
