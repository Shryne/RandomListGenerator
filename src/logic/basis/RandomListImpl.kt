package logic.basis

import java.util.*

class RandomListImpl : RandomList {
    private companion object {
        private const val MAX_NUM = 10
    }

    private val container: List<Int>
    override val first get() = container.first()
    override val last get() = container.last()
    override val elements: Collection<Int> get() = container

    /**
     * Initial constructor. The resulting RandomList will contain the given amount of random numbers ranging between 0
     * and 10 (exclusive).
     */
    constructor(amount: Int) {
        val random = Random()
        container = List(amount) { random.nextInt(MAX_NUM) }
    }

    constructor(randomList: RandomList) {
        container = listOf(Random().nextInt(MAX_NUM)) + randomList.elements.drop(1)
    }

    override fun next() = RandomListImpl(this)

    override fun toString() = "RandomList: $elements}"
}