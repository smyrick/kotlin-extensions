package dev.smyrick.kotlin.collections

/**
 * Returns true if the `item` is NOT the collection
 * Otherwise returns false
 */
fun <T> Collection<T>.doesNotContain(item: T): Boolean = this.contains(item).not()
