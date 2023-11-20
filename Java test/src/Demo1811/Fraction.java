package Demo1811;
import java.util.Scanner;
public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction() {
        this(0,1);
    }

    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0){
            System.out.println("Mau so khong the bang 0");
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
            rutGon();
        }
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }
    public void setTuSo(int tuSo){
        this.tuSo = tuSo;
        rutGon();
    }

    public void setMauSo(int mauSo){
        if (mauSo == 0){
            System.out.println("Mau so khong the bang 0");
        } else{
            this.mauSo = mauSo;
            rutGon();
        }
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap tu so: ");
        int inputTuSo = scanner.nextInt();
        setTuSo(inputTuSo);
        System.out.print("Nhap mau so: ");
        int inputMauSo = scanner.nextInt();
        setMauSo(inputMauSo);
    }
    public void print(){
        System.out.println(tuSo + "/" + mauSo);
    }
    public int usc(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public void rutGon(){
        int usc = usc(Math.abs(tuSo), Math.abs(mauSo));
        tuSo /= usc;
        mauSo /= usc;
    }

    public Fraction reverse() {
        return new Fraction(mauSo, tuSo);
    }

    public Fraction add(Fraction other) {
        int resultNumerator = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
        int resultDenominator = this.mauSo * other.mauSo;
        return new Fraction(resultNumerator, resultDenominator);
    }

    // Trừ hai phân số
    public Fraction subtract(Fraction other) {
        int resultNumerator = this.tuSo * other.mauSo - other.tuSo * this.mauSo;
        int resultDenominator = this.mauSo * other.mauSo;
        return new Fraction(resultNumerator, resultDenominator);
    }

    // Nhân hai phân số
    public Fraction multiply(Fraction other) {
        int resultNumerator = this.tuSo * other.tuSo;
        int resultDenominator = this.mauSo * other.mauSo;
        return new Fraction(resultNumerator, resultDenominator);
    }

    // Chia hai phân số
    public Fraction divide(Fraction other) {
        if (other.tuSo == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0.");
        }
        int resultNumerator = this.tuSo * other.mauSo;
        int resultDenominator = this.tuSo * other.tuSo;
        return new Fraction(resultNumerator, resultDenominator);
    }

}
