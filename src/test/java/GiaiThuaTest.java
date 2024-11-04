import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GiaiThuaTest {

    @Test
    void testTinhGiaiThua() {
        GiaiThua giaiThua = new GiaiThua();
        // Kỹ thuật biên
        assertEquals(-1, giaiThua.tinhGiaiThua(-1));
        assertEquals(1, giaiThua.tinhGiaiThua(0));
        assertEquals(1, giaiThua.tinhGiaiThua(1));
        assertEquals(39916800, giaiThua.tinhGiaiThua(11));
        assertEquals(479001600, giaiThua.tinhGiaiThua(12));
        assertEquals(-1, giaiThua.tinhGiaiThua(13));

        // Phân vùng tương đương
        assertEquals(-1, giaiThua.tinhGiaiThua(-5));
        assertEquals(720, giaiThua.tinhGiaiThua(6));
        assertEquals(-1, giaiThua.tinhGiaiThua(17));
        assertEquals(6, giaiThua.tinhGiaiThua(3));
    }
}