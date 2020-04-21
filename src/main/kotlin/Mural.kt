import java.lang.Integer.max
import java.util.*


fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) { testNumber ->
        val n = input.nextInt()
        val mural = input.next().toCharArray().map(Character::getNumericValue)

        println("Case #${testNumber + 1}: ${solveMural(mural)}")
    }

}

fun solveMural(mural: List<Int>): Int {
    val paintSize = (mural.size + 1) / 2
    val leftScore = mural.subList(0, paintSize).sum()
    var maxScore = leftScore

    var lastScore = leftScore
    for (i in paintSize until mural.size) {
        lastScore = lastScore - (mural[i - paintSize]) + (mural[i])
        maxScore = max(maxScore, lastScore)
    }

    return maxScore
}
