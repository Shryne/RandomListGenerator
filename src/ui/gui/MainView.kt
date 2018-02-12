package ui.gui

import javafx.scene.layout.Pane
import logic.basis.RandomListImpl
import logic.sequence.SequenceImpl
import logic.sequence.TimedInputImpl
import tornadofx.*

/**
 *
 */
class MainView: View() {
    override val root: Pane by fxml("view.fxml")
}

class MainViewStyle: Stylesheet() {
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