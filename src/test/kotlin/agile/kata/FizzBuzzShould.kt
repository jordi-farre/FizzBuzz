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

    @Test
    fun `return and string representing number 2`() {
        assertThat(fizzBuzz.stringFrom(2), `is`(equalTo("2")))
    }

    @Test
    fun `return and string representing number 4`() {
        assertThat(fizzBuzz.stringFrom(4), `is`(equalTo("4")))
    }

    @Test
    fun `return and string representing number 3`() {
        assertThat(fizzBuzz.stringFrom(3), `is`(equalTo("Fizz")))
    }

}


