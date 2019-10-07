package agile.kata

class FizzBuzz {

    private fun Int.divisibleBy(number: Int): Boolean = this % number == 0

    fun stringFrom(number: Int): String =
        when {
            number.divisibleBy(3) && number.divisibleBy(5) -> "FizzBuzz"
            number.divisibleBy(3) -> "Fizz"
            number.divisibleBy(5) -> "Buzz"
            else -> number.toString()
        }

}
