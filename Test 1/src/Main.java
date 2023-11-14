// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int n = 22;
        int ketQua = timSoNguyenToGanNhat(n);
        System.out.println(ketQua);
    }
    static boolean check (int n) {
        if (n <= 1)
            return false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static int timSoNguyenToGanNhat (int x) {
        if(x == 2) {
            return 0;
        }
        int soCanTim = 0;

        for (int i = x - 1; i >= 2; i--) {
            if(check(i)){
                soCanTim = i;
                break;
            }
        }
        return soCanTim;
    }
}