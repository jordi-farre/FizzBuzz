package agile.kata

class FizzBuzz(private val fizzBuzzRules: List<FizzBuzzRule>) {

    fun stringFrom(number: Int): String = fizzBuzzRules.first { it.canHandle(number) }.stringFrom(number)

    companion object FizzBuzz {

        fun create(): agile.kata.FizzBuzz = FizzBuzz(listOf(
            DivisibleByThreeAndFive(), DivisibleByThree(), DivisibleByFive(), NotDivisibleByThreeAndFive()
        ))

    }

}
