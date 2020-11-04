package ir.mobitrain.hiltRoboletricSample

import android.os.Build.VERSION_CODES.P
import androidx.test.core.app.launchActivity
import dagger.hilt.android.testing.HiltAndroidRule

import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import dagger.hilt.android.testing.UninstallModules
import org.junit.Test
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@HiltAndroidTest
@Config(sdk = [P], application = HiltTestApplication::class)
@RunWith(RobolectricTestRunner::class)
@UninstallModules(MainActivityModule::class)
class MainActivityTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun `test View Model Call Listener`() {
        launchActivity<MainActivity>().onActivity {
            it.viewModel.callTest()
        }
    }

}