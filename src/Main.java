import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, tutar = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen KM Değerini Giriniz : ");

        km = input.nextInt();
        tutar += (perKm*km);
        tutar = (tutar < 20 ? 20 : tutar);

        System.out.println("Ödeyeceğiniz Miktar : " + tutar);
    }
}