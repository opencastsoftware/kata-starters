import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KataTest {
    @Test
    internal fun shouldIncrementValueByOne() {
        val kata = Kata()
        assertEquals(2, kata.increment(1))
    }
}