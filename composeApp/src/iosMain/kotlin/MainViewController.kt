import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import domain.CustomBatteryManager

fun MainViewController() = ComposeUIViewController {
    App(
        batteryManager = remember { CustomBatteryManager() }
    )
}