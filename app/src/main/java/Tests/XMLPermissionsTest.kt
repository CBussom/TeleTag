package Tests
import android.content.pm.PackageManager
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
class XMLPermissionsTest {
    fun testBluetoothPermission() {
        val permissionToCheck = android.Manifest.permission.BLUETOOTH
        val context = InstrumentationRegistry.getInstrumentation().targetContext

        val permissionStatus = context.checkSelfPermission(permissionToCheck)

        // Check if the permission is granted
        assertEquals(PackageManager.PERMISSION_GRANTED, permissionStatus)
    }
}