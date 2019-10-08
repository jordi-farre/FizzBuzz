package agile.kata

class FizzBuzz {

    private val fizzBuzzRules = listOf(
        DivisibleByThreeAndFive(), DivisibleByThree(), DivisibleByFive(), NotDivisibleByThreeAndFive()
    )

    fun stringFrom(number: Int): String =
        fizzBuzzRules.first { it.canHandle(number) }.stringFrom(number)

}
