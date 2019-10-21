package agile.kata

import arrow.core.Option
import arrow.core.firstOrNone
import arrow.core.getOrElse

class FizzBuzz(private val fizzBuzzRules: List<(Int) -> Option<String>>) {

    fun stringFrom(number: Int): String =
        fizzBuzzRules
            .map { it.invoke(number) }
            .firstOrNone { it.nonEmpty() }
            .map { it.getOrElse { "RuleNotAvailable" } }
            .getOrElse { "RuleNotSupported" }

    companion object FizzBuzz {

        fun create(): agile.kata.FizzBuzz = FizzBuzz(listOf(
            { number -> divisibleByThreeAndFive(number) },
            { number -> divisibleByThree(number) },
            { number -> divisibleByFive(number) },
            { number -> notDivisibleByThreeAndFive(number) }
        ))
    }

}
