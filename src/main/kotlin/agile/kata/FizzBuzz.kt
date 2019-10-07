package agile.kata

class FizzBuzz {

    private fun Int.divisibleBy(number: Int): Boolean = this % number == 0

    fun stringFrom(number: Int): String =
        if (number.divisibleBy(3) && number.divisibleBy(5)) "FizzBuzz"
        else if (number.divisibleBy(3)) "Fizz"
        else if (number.divisibleBy(5)) "Buzz"
        else number.toString()

}
