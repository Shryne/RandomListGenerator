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
class NumberField(onChange: (Int) -> Unit): FxWrapper {
    companion object {
        private val numberRegex = Regex("[0-9]")
    }

    private val textField: TextField = TextField()

    init {
        textField.textProperty().onChange {
            if (it!!.isInt()) {
                onChange(Integer.parseInt(it))
            }
            textField.text = ""
        }
    }

    override val pane: Pane = Pane().apply {
        add(textField)
    }

    private fun String.isInt() = matches(numberRegex)
}