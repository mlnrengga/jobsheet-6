import java.util.Scanner;
public class Pemilihan2Percobaan115 {
    public static void main(String[] args) {
    Scanner input15 = new Scanner (System.in);
    System.out.print("Masukkan Tahun: ");
    int tahun = input15.nextInt();

    if ((tahun % 4) == 0) {
        if ((tahun % 100) != 0) {
        System.out.println("Tahun Kabisat");
        }else {
            System.out.println("Tahun 2100 Bukan Tahun Kabisat"); 
        }
    } else  
        System.out.println("Bukan Tahun Kabisat");
    input15.close();
}
}