public class TinhTongLe {
    public int tinhTongLe(int n) {
        if (n == 0){
            return 0;
        }
        if (n < 0 || n > 400){
            return -1;
        }

        int tong = 0;
        for (int i = 1; i <= n; i += 2) {
            tong += i;
        }
        return tong;
    }
}
