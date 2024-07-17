import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import domain.CustomBatteryManager

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMPTemplate",
    ) {
        App(remember { CustomBatteryManager() })
    }
}