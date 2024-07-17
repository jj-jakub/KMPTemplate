package domain

import oshi.SystemInfo
import kotlin.math.roundToInt

actual class CustomBatteryManager {
    actual fun getBatteryLevel(): Int {
        val batteryLevel = SystemInfo().hardware.powerSources.firstOrNull()
        return batteryLevel?.remainingCapacityPercent?.times(100)?.roundToInt() ?: -1
    }
}