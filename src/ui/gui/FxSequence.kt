package ui.gui

import javafx.event.EventTarget
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.Pane
import logic.sequence.Sequence
import tornadofx.add

/**
 * - mutable
 *
 * @param
 * @return
 */
class FxSequence(private val sequence: Sequence, private val label: Label) : Sequence by sequence {
    init {
        label.text = sequence.randomList.last.toString()
    }

    override fun nextInput(input: Int) {
        sequence.nextInput(input)
        label.text = sequence.randomList.last.toString()
    }

    override fun tick() {
        sequence.tick()
        label.text = sequence.randomList.last.toString()
    }
}