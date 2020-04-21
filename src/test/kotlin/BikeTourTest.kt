import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

internal class BikeTourTest {

    @TestFactory
    fun bikeTour() = listOf(
        listOf(10, 20, 14) to 1,
        listOf(7, 7, 7, 7) to 0,
        listOf(10, 90, 20, 90, 10) to 2,
        listOf(10, 3, 10) to 0
    ).map { (input, expected) ->
        DynamicTest.dynamicTest("with checkpoints $input then I get $expected peeks") {
            assertEquals(expected, solveBikeTour(input))
        }
    }

}