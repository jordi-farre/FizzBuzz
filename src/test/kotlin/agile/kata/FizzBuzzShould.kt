package agile.kata

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class FizzBuzzShould {

    private val fizzBuzz: FizzBuzz = FizzBuzz.create()

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 4])
    fun `return string representing the number for numbers not divisible by 3 or 5`(number: Int) {
        assertThat(fizzBuzz.stringFrom(number), (equalTo(number.toString())))
    }

    @ParameterizedTest
    @ValueSource(ints = [3, 12, 24])
    fun `return Fizz string for numbers divisible by 3`(number: Int) {
        assertThat(fizzBuzz.stringFrom(number), (equalTo("Fizz")))
    }

    @ParameterizedTest
    @ValueSource(ints = [5, 25, 55])
    fun `return Buzz string for numbers divisible by 5`(number: Int) {
        assertThat(fizzBuzz.stringFrom(number), (equalTo("Buzz")))
    }

    @ParameterizedTest
    @ValueSource(ints = [15, 30, 60, 150])
    fun `return Buzz string for numbers divisible by 3 and 5`(number: Int) {
        assertThat(fizzBuzz.stringFrom(number), (equalTo("FizzBuzz")))
    }

}


