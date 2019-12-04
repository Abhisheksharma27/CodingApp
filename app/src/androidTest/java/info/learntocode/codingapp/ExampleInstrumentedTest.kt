<<<<<<< HEAD:app/src/androidTest/java/info/learntocode/codingapp/ExampleInstrumentedTest.kt
package info.learntocode.codingapp
=======
<<<<<<< HEAD:app/src/androidTest/java/com/learncode/codingapp/ExampleInstrumentedTest.kt
package com.learncode.codingapp
=======
package com.learntocode.codingapp
>>>>>>> 9281bb3bef09da154a2e1eba667ba14461ad21ef:app/src/androidTest/java/com/learntocode/codingapp/ExampleInstrumentedTest.kt
>>>>>>> 3c3239577babc754f33ccf6f758ec90df27ef6d0:app/src/androidTest/java/com/learntocode/codingapp/ExampleInstrumentedTest.kt

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.codingapp", appContext.packageName)
    }
}
