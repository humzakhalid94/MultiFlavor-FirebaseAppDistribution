package mhk.app.multiflavor_firebaseappdistribution

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy
import tools.fastlane.screengrab.locale.LocaleTestRule
import com.google.android.material.datepicker.DateValidatorPointBackward.before
import org.junit.Before


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Rule @JvmField
    val localeTestRule = LocaleTestRule()

    @Before
    fun setUp() {
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())
    }

    @Test
    fun testTakeScreenshot() {
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        Screengrab.screenshot("before_button_click")

        onView(withId(R.id.generateButton)).perform(click())

        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        Screengrab.screenshot("after_button_click")
    }

    @Test
    fun testTakeScreenshot1() {
        val scenario: ActivityScenario<*> = activityRule.scenario
        scenario.moveToState(Lifecycle.State.RESUMED)
        //1
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())

        Espresso.onView(ViewMatchers.withId(R.id.generateButton))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        //2
        Screengrab.screenshot("rwmagic8ball_beforeFabClick")
        //3
        Espresso.onView(ViewMatchers.withId(R.id.generateButton)).perform(ViewActions.click())
        //4
        Screengrab.screenshot("rwmagic8ball_afterFabClick")
    }

}