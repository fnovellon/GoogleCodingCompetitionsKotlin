import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class MuralTest {

    @ParameterizedTest
    @MethodSource("muralArgs")
    fun mural(input: List<Int>, expected: Int) {
        assertEquals(expected, solveMural(input))
    }

    companion object {
        @JvmStatic
        fun muralArgs() = listOf(
            Arguments.of(listOf(1, 3, 3, 2), 6),
            Arguments.of(listOf(9, 5, 8, 3), 14),
            Arguments.of(listOf(6, 1, 6), 7),
            Arguments.of(listOf(1, 0, 2, 9, 3, 8, 4, 7, 5, 6), 31)
        )
    }

}