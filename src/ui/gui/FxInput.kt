package ui.gui

import javafx.event.EventTarget
import javafx.scene.layout.Pane
import logic.sequence.InputClient
import tornadofx.add

/**
 * - mutable
 *
 * @param
 * @return
 */
class FxInput(inputClient: InputClient): FxWrapper {
    private val numberField = NumberField {
        inputClient.nextInput(it)
    }

    override val pane: Pane = numberField.pane
}