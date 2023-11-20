import Demo1811.Fraction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(5, 40);

        fraction1.print();
        fraction2.print();

        Fraction tong = fraction1.add(fraction2);
        Fraction hieu = fraction1.subtract(fraction2);
        Fraction tich = fraction1.multiply(fraction2);
        Fraction thuong = fraction1.divide(fraction2);

        System.out.println("Tổng:");
        tong.print();

        System.out.println("Hiệu:");
        hieu.print();

        System.out.println("Tích:");
        tich.print();

        System.out.println("Thương:");
        thuong.print();
    }
}