package logic

/**
 * A list containing a certain amount of numbers (see implementation).
 */
interface RandomList {
    /**
     * Returns the first element of the list.
     */
    val first: Int

    /**
     * Returns all the elements in the list.
     */
    val elements: Collection<Int>
}