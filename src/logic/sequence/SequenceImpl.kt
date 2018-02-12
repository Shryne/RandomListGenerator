package logic.sequence

import logic.basis.RandomList

/**
 *
 */
class SequenceImpl(randomList: RandomList)
    : Sequence{

    override var randomList = randomList
        private set
    val correctInputPercentage: Double get() = TODO()

    /**
     * This method is synchronized, because the calculation of the inputPercantage could be wrong, if two threads use
     * this method and for example [tick] at the same time.
     */
    override fun nextInput(input: Int) {
        synchronized(this) {
            if (input == randomList.first) {
                // TODO
            } else {
                // TODO
            }
            randomList = randomList.next()
        }
    }

    /**
     * This method is synchronized, because the calculation of the inputPercantage could be wrong, if two threads use
     * this method and for example [nextInput] at the same time.
     */
    override fun tick() {
        synchronized(this) {
            // TODO percentage stuff
            randomList = randomList.next()
        }
    }
}