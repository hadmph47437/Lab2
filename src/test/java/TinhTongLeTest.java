import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TinhTongLeTest {

    @Test
    void testTinhTongLe() {
        TinhTongLe tinhTongLe = new TinhTongLe();
        //pvb
        assertEquals(0, tinhTongLe.tinhTongLe(0));
        assertEquals(1, tinhTongLe.tinhTongLe(1));
        assertEquals(1, tinhTongLe.tinhTongLe(2));
        assertEquals(2500, tinhTongLe.tinhTongLe(99));
        assertEquals(2500, tinhTongLe.tinhTongLe(100));
        assertEquals(2601, tinhTongLe.tinhTongLe(101));

        //đoán lỗi
        assertEquals(0, tinhTongLe.tinhTongLe(-3));
        assertEquals(0, tinhTongLe.tinhTongLe(-1));
        assertEquals(10000, tinhTongLe.tinhTongLe(200));
        assertEquals(1000000, tinhTongLe.tinhTongLe(2000));

    }
}
