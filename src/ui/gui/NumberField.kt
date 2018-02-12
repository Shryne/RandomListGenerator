package ui.gui

import javafx.event.EventTarget
import javafx.scene.Node
import javafx.scene.control.TextField
import javafx.scene.layout.Pane
import tornadofx.add
import tornadofx.onChange

/**
 * - mutable
 *
 * @param
 * @return
 */
class NumberField(textField: TextField, onChange: (Int) -> Unit) {
    companion object {
        private val numberRegex = Regex("[0-9]")
    }

    init {
        textField.textProperty().onChange {
            if (it!!.isInt()) {
                onChange(Integer.parseInt(it))
            }
            textField.text = ""
        }
    }
    private fun String.isInt() = matches(numberRegex)
}