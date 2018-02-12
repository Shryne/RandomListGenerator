package logic

import logic.basis.RandomListImpl
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * - mutable
 *
 * @param
 * @return
 */
internal class RandomListImplTest {
    @Test
    fun get() {
        with(RandomListImpl(5)) {
            assertEquals(first, elements.first())
        }
    }

    @Test
    fun amount() {
        with(15) {
            assertEquals(this, RandomListImpl(this).elements.size)
        }
    }

    @Test
    fun otherRandomList() {
        val additionalElements = RandomListImpl(20)
        val newList = RandomListImpl(additionalElements)

        assertEquals(
                listOf(newList.first) + additionalElements.elements.drop(1),
                newList.elements
        )
    }

    @Test
    fun rightRange() {
        with(RandomListImpl(100)) {
            assertTrue(
                    elements.all {
                        (0 <= it) and (it < 10)
                    },
                    toString()
            )
        }
    }
}