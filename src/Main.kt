import javafx.application.Application
import javafx.stage.Stage


class Main: Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage!!.title = "Welcome"
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Main::class.java)
        }
    }
}

