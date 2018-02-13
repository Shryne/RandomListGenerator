package ui.gui

import javafx.scene.control.TextField
import logic.sequence.InputClient

/**
 * - mutable
 *
 * @param
 * @return
 */
class FxInput(inputClient: InputClient, textField: TextField) {
    private val numberField = DigitField(textField) {
        inputClient.nextInput(it)
    }
}