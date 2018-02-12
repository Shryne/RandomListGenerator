package ui.gui

import javafx.event.EventTarget
import javafx.scene.control.Label
import javafx.scene.layout.Pane
import logic.sequence.Sequence
import tornadofx.add

/**
 * - mutable
 *
 * @param
 * @return
 */
class FxSequence(private val sequence: Sequence) : FxWrapper, Sequence by sequence {
    private val label = Label()

    override fun nextInput(input: Int) {
        sequence.nextInput(input)
        label.text = sequence.randomList.last.toString()
    }

    override fun tick() {
        sequence.tick()
        label.text = sequence.randomList.last.toString()
    }

    override val pane: Pane = Pane().apply {
        add(label)
    }
}