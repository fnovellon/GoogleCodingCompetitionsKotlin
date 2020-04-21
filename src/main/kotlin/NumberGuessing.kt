import java.util.*

fun search(input: Scanner, min: Int, max: Int): Int {
    val guess: Int = (min + max) / 2
    println(guess)
    return when (input.next()) {
        "CORRECT" -> guess
        "TOO_SMALL" -> search(input, guess + 1, max)
        "TOO_BIG" -> search(input, min, guess - 1)
        else -> throw IllegalArgumentException()
    }
}

fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) { _ ->
        var a = input.nextInt()
        var b = input.nextInt()
        val n = input.nextInt()

        search(input, a + 1, b)
    }
}
