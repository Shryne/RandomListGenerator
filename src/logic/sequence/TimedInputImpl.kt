package logic.sequence

import java.util.*
import kotlin.concurrent.timerTask

/**
 * - mutable because the tickTime can be set.
 *
 * @param tickTime The amount of time in milliseconds needed to get a timer update.
 */
class TimedInputImpl<C>(var tickTime: Long, private val timedInputClient: C) : TimedInput
        where C : TimerClient,
              C : InputClient {

    private var task = timerTask { timedInputClient.tick() }
    private val timer = Timer(true)

    override fun nextInput(input: Int) {
        task.cancel()
        timedInputClient.nextInput(input)
        task = timerTask { timedInputClient.tick() }
        timer.scheduleAtFixedRate(task, tickTime, tickTime)
    }
}