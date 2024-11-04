public class TinhTong {
    public int tinhTong(int n) {
        if (n < 1) return 0;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        return tong;
    }
}

