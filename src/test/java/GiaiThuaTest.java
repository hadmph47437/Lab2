import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GiaiThuaTest {

    GiaiThua giaiThua;

    @BeforeEach
    void setUp() {
        giaiThua = new GiaiThua();
    }

    @AfterEach
    void tearDown() {
        giaiThua = null;
    }

    //========= Kiểu int gtri giai thừa max = 12! ===========//
    //========= 13! sẽ hơn 6 tỷ vượt quá 2^31 (khoảng 2 tỷ 1)
    @Test
    void testTinhGiaiThua() {
        // ptich giá trị biên
        assertEquals(-1, giaiThua.tinhGiaiThua(-1));
        assertEquals(1, giaiThua.tinhGiaiThua(0));
        assertEquals(1, giaiThua.tinhGiaiThua(1));
        assertEquals(39916800, giaiThua.tinhGiaiThua(11));
        assertEquals(479001600, giaiThua.tinhGiaiThua(12));
        assertEquals(-1, giaiThua.tinhGiaiThua(13));

        // Phân vùng tương đương
        assertEquals(-1, giaiThua.tinhGiaiThua(-5));
        assertEquals(24, giaiThua.tinhGiaiThua(4));
        assertEquals(-1, giaiThua.tinhGiaiThua(17));
        // vùng tương đương vs giá trị trung bình quãng giữa = 6
        assertEquals(720, giaiThua.tinhGiaiThua(6));
    }
}