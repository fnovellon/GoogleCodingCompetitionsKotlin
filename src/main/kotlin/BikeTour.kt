import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) { testNumber ->
        val n = input.nextInt()
        val checkPoints = List(n) {
            input.nextInt()
        }

        println("Case #${testNumber + 1}: ${solveBikeTour(checkPoints)}")
    }

}

fun solveBikeTour(checkPoints: List<Int>): Int {
    var peakCount = 0
    for (i in 1 until checkPoints.size - 1) {
        if (checkPoints[i] > checkPoints[i - 1] && checkPoints[i] > checkPoints[i + 1]) {
            peakCount++
        }
    }

    return peakCount
}

