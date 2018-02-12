import javafx.application.Application
import tornadofx.*
import ui.gui.MainView
import ui.gui.MainViewStyle

// Do I really have to add all style classes here?
class Main : App(MainView::class, MainViewStyle::class) {
    init {
        reloadStylesheetsOnFocus()
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}