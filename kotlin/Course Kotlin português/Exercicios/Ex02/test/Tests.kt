import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testContarNumeros01() {
        Assert.assertEquals(5, contarPositivos(listOf(-58, 75, 46, -65, -27, 12, 62, -66, 59, -73)))
        Assert.assertEquals(5, contarNegativos(listOf(-58, 75, 46, -65, -27, 12, 62, -66, 59, -73)))
    }

    @Test fun testContarNumeros02() {
        Assert.assertEquals(2, contarPositivos(listOf(-43, -1, -31, -12, -87, -18, 21, 78, -57, -54)))
        Assert.assertEquals(8, contarNegativos(listOf(-43, -1, -31, -12, -87, -18, 21, 78, -57, -54)))
    }

    @Test fun testContarNumeros03() {
        Assert.assertEquals(5, contarPositivos(listOf(0, 0, 0, 0, 0)))
        Assert.assertEquals(0, contarNegativos(listOf(0, 0, 0, 0, 0)))
    }

    @Test fun testContarNumeros04() {
        Assert.assertEquals(5, contarPositivos(listOf(1, 2, 3, 4, 5)))
        Assert.assertEquals(5, contarNegativos(listOf(-10, -9, -8, -7, -6)))
    }
}