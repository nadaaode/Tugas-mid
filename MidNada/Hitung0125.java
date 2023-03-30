import java.util.Scanner;

public class Hitung0125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Dollar: ");
        int Dollar = input.nextIntjavac();

        double Rupiah = Dollar * 150948;

        System.out.println("Hasil " + Dollar + " Dollar = " + Rupiah + " Rupiah");
    }
}
