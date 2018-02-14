import javafx.application.Application
import javafx.stage.Stage
import tornadofx.*
import ui.gui.MainView
import ui.gui.MainViewStyle

// Do I really have to add all style classes here?
class Main : App(MainView::class, MainViewStyle::class) {
    init {
        reloadStylesheetsOnFocus()
    }

    override fun start(stage: Stage) {
        stage.isResizable = false
        super.start(stage)
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}