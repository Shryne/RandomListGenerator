package logic.sequence

import logic.basis.RandomList

/**
 *
 */
class SequenceImpl(randomList: RandomList) : Sequence {

    private var wrongTimes = 0
    private var rightTimes = 0
    override var randomList = randomList
        private set
    override val correctInputPercentage: Double
        get() = (rightTimes.toDouble() / (wrongTimes + rightTimes).toDouble())

    /**
     * This method is synchronized, because the calculation of the inputPercantage could be wrong, if two threads use
     * this method and for example [tick] at the same time.
     */
    override fun nextInput(input: Int) {
        synchronized(this) {
            if (input == randomList.first) {
                rightTimes++
            } else {
                wrongTimes++
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
            wrongTimes++
            randomList = randomList.next()
        }
    }
}