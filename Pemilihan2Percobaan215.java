import java.util.Scanner;
public class Pemilihan2Percobaan215 {
public static void main(String[] args) {
    Scanner input15 = new Scanner (System.in);
    float totalSudut;

    System.out.print("Masukkan Nilai Sudut 1: ");
    float sudut1 = input15.nextFloat();
    System.out.print("Masukkan Nilai Sudut 2: ");
    float sudut2 = input15.nextFloat();
    System.out.print("Masukkan Nilai Sudut 3: ");
    float sudut3 = input15.nextFloat();

    totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
            System.out.println("Segitiga Tersebut Adalah Segitiga Siku Siku");
        }else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
            System.out.println("Segitiga Tersebut Adalah Segitiga Sama Kaki");
        }else if ((sudut1 == sudut2) && (sudut1 == sudut3)) {
            System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
        }else{ 
            System.out.println("Segitiga Tersebut Adalah Segitiga Sembarang");
        } 
        }else
        System.out.println("Bukan Segitiga");
        
        input15.close();  
}
}

