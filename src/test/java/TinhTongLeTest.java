import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TinhTongLeTest {

    TinhTongLe tinhTongLe;

    @BeforeEach
    void setUp() {
        tinhTongLe = new TinhTongLe();
    }

    @AfterEach
    void tearDown() {
        tinhTongLe = null;
    }

    //============ Giả sử N max = 400 ===============//

    @Test
    void testTinhTongLe() {
        TinhTongLe tinhTongLe = new TinhTongLe();
        //phân vùng tương đuong
        assertEquals(-1, tinhTongLe.tinhTongLe(-123));
        assertEquals(225, tinhTongLe.tinhTongLe(30));
        assertEquals(-1, tinhTongLe.tinhTongLe(444));
        //phân vùng tương đuong vs gtri trung bình khoảng giữa là 200
        assertEquals(10000, tinhTongLe.tinhTongLe(200));


        // phân tích gtri biên
        assertEquals(0, tinhTongLe.tinhTongLe(0));
        assertEquals(1, tinhTongLe.tinhTongLe(1));
        assertEquals(1, tinhTongLe.tinhTongLe(2));
        assertEquals(40000, tinhTongLe.tinhTongLe(399));
        assertEquals(40000, tinhTongLe.tinhTongLe(400));
        assertEquals(-1, tinhTongLe.tinhTongLe(401));


    }
}
