package dev.smyrick.kotlin.bool

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class BooleanExtensionsKtTest {

    @Test
    fun toNonNull() {
        val trueBool: Boolean? = true
        val falseBool: Boolean? = false
        val nullBool: Boolean? = null

        assertTrue(trueBool.toNonNull())
        assertFalse(falseBool.toNonNull())
        assertFalse(nullBool.toNonNull())
    }
}
