public class GiaiThua {

    public int tinhGiaiThua(int n) {
        if (n < 0 || n > 12) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int ketQua = 1;
        for (int i = 2; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }

    public static void main(String[] args) {
        GiaiThua gt = new GiaiThua();
        int n = 3;
        System.out.printf("Kết quả giai thừa của %d là: %d%n", n, gt.tinhGiaiThua(n));
    }
}
