public class TinhTongLe {
    public int tinhTongLe(int n) {
        if (n < 1) return 0;
        int tong = 0;
        for (int i = 1; i <= n; i += 2) {
            tong += i;
        }
        return tong;
    }
}
