import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {

    @Test
    void testTinhTong() {
        TinhTong tinhTong = new TinhTong();
        //pvtd
        assertEquals(0, tinhTong.tinhTong(-10));
        assertEquals(21, tinhTong.tinhTong(6));
        assertEquals(55611, tinhTong.tinhTong(333));

        //pvb
        assertEquals(0, tinhTong.tinhTong(0));
        assertEquals(1, tinhTong.tinhTong(1));
        assertEquals(3, tinhTong.tinhTong(2));
        assertEquals(79800, tinhTong.tinhTong(399));
        assertEquals(80200, tinhTong.tinhTong(400));
        assertEquals(80601, tinhTong.tinhTong(401));
        assertEquals(2005003, tinhTong.tinhTong(2002));

    }
}
