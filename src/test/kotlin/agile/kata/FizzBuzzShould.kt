package agile.kata

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class FizzBuzzShould {

    private val fizzBuzz: FizzBuzz = FizzBuzz()

    @Test
    fun `return and string representing number 1`() {
        assertThat(fizzBuzz.stringFrom(1), `is`(equalTo("1")))
    }
}


