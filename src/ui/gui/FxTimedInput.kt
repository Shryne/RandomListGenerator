package ui.gui

import javafx.event.EventTarget
import javafx.scene.control.Button
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
class FxTimedInput(timedInput: TimedInput, StopButton: Button, SlowerButton: Button, FasterButton: Button)
    : TimedInput by timedInput {

}