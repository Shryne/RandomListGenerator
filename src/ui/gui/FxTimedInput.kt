package ui.gui

import javafx.event.EventTarget
import javafx.scene.layout.FlowPane
import javafx.scene.layout.Pane
import javafx.scene.layout.TilePane
import logic.sequence.TimedInput
import tornadofx.add
import tornadofx.button

/**
 * - mutable
 *
 * @param
 * @return
 */
class FxTimedInput(timedInput: TimedInput) : FxWrapper, TimedInput by timedInput {
    override val pane: Pane = TilePane().apply {
        button("S") {

        }
        button("U") {

        }
        button("D") {

        }
    }
}