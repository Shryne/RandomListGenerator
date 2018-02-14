package logic.sequence

import logic.basis.RandomList

interface Sequence : TimerClient, InputClient {
    val correctInputPercentage: Double
    val randomList: RandomList
}