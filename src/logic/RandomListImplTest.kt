package logic

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

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
}