import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    TinhTong tinhTong;

    @BeforeEach
    void setUp() {
        tinhTong = new TinhTong();
    }

    @AfterEach
    void tearDown() {
        tinhTong = null;
    }

    //============ Giả sử N max = 400 ===============//

    @Test
    void testTinhTong() {
        //phaan vùng tương đương
        assertEquals(-1, tinhTong.tinhTong(-10));
        assertEquals(21, tinhTong.tinhTong(6));
        assertEquals(-1, tinhTong.tinhTong(430));
        //test vùng tương đương vs gtri trung bình
        assertEquals(20100, tinhTong.tinhTong(200));


        //phân tích gtri biên
        assertEquals(0, tinhTong.tinhTong(0));
        assertEquals(1, tinhTong.tinhTong(1));
        assertEquals(3, tinhTong.tinhTong(2));
        assertEquals(79800, tinhTong.tinhTong(399));
        assertEquals(80200, tinhTong.tinhTong(400));
        assertEquals(-1, tinhTong.tinhTong(401));

    }
}
