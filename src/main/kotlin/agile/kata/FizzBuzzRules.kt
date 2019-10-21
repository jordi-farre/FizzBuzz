package agile.kata

import arrow.core.Option
import arrow.core.Option.Companion.empty
import arrow.core.Option.Companion.just

private fun Int.divisibleBy(number: Int): Boolean = this % number == 0

fun divisibleByThreeAndFive(number: Int): Option<String> = when {
    number.divisibleBy(3) && number.divisibleBy(5) -> just("FizzBuzz")
    else -> empty()
}

fun divisibleByThree(number: Int): Option<String> = when {
    number.divisibleBy(3) -> just("Fizz")
    else -> empty()
}

fun divisibleByFive(number: Int): Option<String> = when {
    number.divisibleBy(5) -> just("Buzz")
    else -> empty()
}

fun notDivisibleByThreeAndFive(number: Int): Option<String> = when {
    !number.divisibleBy(3) && !number.divisibleBy(5) -> just(number.toString())
    else -> empty()
}