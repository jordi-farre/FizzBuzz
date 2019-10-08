package agile.kata

class FizzBuzz(private val fizzBuzzRules: List<FizzBuzzRule>) {

    fun stringFrom(number: Int): String = fizzBuzzRules.first { it.canHandle(number) }.stringFrom(number)

}
