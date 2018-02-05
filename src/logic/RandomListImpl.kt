package logic

import java.util.*

/**
 *
 * @param
 * @return
 */
class RandomListImpl : RandomList {
    private companion object {
        private const val MAX_NUM = 10
    }

    private val container: List<Int>
    override val first get() = container.first()
    override val elements: Collection<Int> get() = container

    constructor(amount: Int) {
        val random = Random()
        container = List(amount) { random.nextInt(MAX_NUM) }
    }

    constructor(randomList: RandomList) {
        container = listOf(Random().nextInt(MAX_NUM)) + randomList.elements.drop(1)
    }

    override fun toString() = "RandomList: $elements}"
}