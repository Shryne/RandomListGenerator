package ui.gui

import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.Pane
import logic.basis.RandomListImpl
import logic.sequence.SequenceImpl
import logic.sequence.TimedInputImpl
import tornadofx.*

/**
 *
 */
class MainView : View() {
    override val root: Pane by fxml("view.fxml")
    // Unfortunate that I have to define the gui elements here for the using classes
    private val sequenceLabel: Label by fxid("sequenceLabel")
    private val inputField: TextField by fxid("inputField")
    private val timedInputStop: Button by fxid("timedInputStop")
    private val timedInputSlower: Button by fxid("timedInputSlower")
    private val timedInputFaster: Button by fxid("timedInputFaster")

    init {
        FxInput(
                FxTimedInput(
                        TimedInputImpl(
                                1000,
                                FxSequence(
                                        SequenceImpl(
                                                RandomListImpl(1)
                                        ),
                                        sequenceLabel
                                )
                        ),
                        timedInputStop,
                        timedInputSlower,
                        timedInputFaster
                ),
                inputField
        )
    }
}

class MainViewStyle : Stylesheet() {
    companion object {
        val normalButton by cssclass()
        val normalTextField by cssclass()

        private val normalFontSize = 30.px
    }

    init {
        normalButton {
            fontSize = normalFontSize
        }

        normalTextField {
            fontSize = normalFontSize
        }
    }
}