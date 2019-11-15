package dev.smyrick.kotlin.collections

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CollectionsExtensionsKtTest {

    @Test
    fun doesNotContain() {
        val list = listOf(1)
        assertTrue(list.doesNotContain(2))
        assertFalse(list.doesNotContain(1))
    }
}
