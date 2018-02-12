package logic.basis

/**
 * A list containing a certain amount of numbers (see implementation).
 */
interface RandomList {
    /**
     * Returns the first element of the list.
     */
    val first: Int

    /**
     * Returns the last element of the list.
     */
    val last: Int

    /**
     * Returns all the elements in the list.
     */
    val elements: Collection<Int>

    /**
     * Returns a new RandomList with the first number dropped and a new random number at the end of the list.
     */
    fun next(): RandomList
}