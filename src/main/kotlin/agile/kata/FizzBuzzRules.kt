package agile.kata

private fun Int.divisibleBy(number: Int): Boolean = this % number == 0

interface FizzBuzzRule {

    fun canHandle(number: Int): Boolean

    fun stringFrom(number: Int): String

}

class DivisibleByThreeAndFive: FizzBuzzRule {

    override fun canHandle(number: Int): Boolean = number.divisibleBy(3) && number.divisibleBy(5)

    override fun stringFrom(number: Int): String = "FizzBuzz"

}

class DivisibleByThree: FizzBuzzRule {

    override fun canHandle(number: Int): Boolean = number.divisibleBy(3)

    override fun stringFrom(number: Int): String = "Fizz"

}

class DivisibleByFive: FizzBuzzRule {

    override fun canHandle(number: Int): Boolean = number.divisibleBy(5)

    override fun stringFrom(number: Int): String = "Buzz"

}

class NotDivisibleByThreeAndFive: FizzBuzzRule {

    override fun canHandle(number: Int): Boolean = !number.divisibleBy(3) && !number.divisibleBy(5)

    override fun stringFrom(number: Int): String = number.toString()

}