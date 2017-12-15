package {{ cookiecutter.package_name }}

import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

import kotlin.test.*

class StubTest {
    @Before fun before() {

    }

    @Test fun stub() {
        assertTrue(true)
    }

    @After fun after() {
    }
}

