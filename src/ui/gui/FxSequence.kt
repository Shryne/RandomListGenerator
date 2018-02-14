package ui.gui

import javafx.event.EventTarget
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.Pane
import logic.sequence.Sequence
import tornadofx.add
import tornadofx.runLater

/**
 * - mutable
 *
 * @param
 * @return
 */
class FxSequence(
        private val sequence: Sequence,
        private val sequenceLabel: Label,
        private val percentageLabel: Label)
    : Sequence by sequence {

    companion object {
        private const val LABEL_TEXT = "Right:"
    }

    init {
        sequenceLabel.text = sequence.randomList.last.toString()
        percentageLabel.text = "$LABEL_TEXT 100 %"
    }

    override fun nextInput(input: Int) {
        sequence.nextInput(input)
        runLater {
            sequenceLabel.text = sequence.randomList.last.toString()
            percentageLabel.text = sequence.correctInputPercentage.percent
        }
    }

    override fun tick() {
        sequence.tick()
        runLater {
            sequenceLabel.text = sequence.randomList.last.toString()
            percentageLabel.text = sequence.correctInputPercentage.percent
        }
    }

    private val Double.percent: String
        get() = "${String.format("%.2f", this * 100)} %"
}