import java.util.ArrayList;
import java.util.Scanner;
public class BioskopWithScanner03{
    public static void main(String[] args){
        Scanner input1 = new Scanner (System.in);
        Scanner input2 = new Scanner(System.in);

        String nama, next;
        int baris, kolom,menu;
        boolean exit;

        String [][] penonton = new String[4][2];

        while (true){
            System.out.print("Menu:");
            System.out.print("\n1. Input data penonton");
            System.out.print("\n2. Menampilkan data penonton");
            System.out.print("\n3. Exit");
            System.out.print("\nPilih menu (1/2/3): ");
            // input.nextInt(); 

            int pilihan = input1.nextInt();
            
            
            if (pilihan == 1){
            System.out.println("Masukkan nama penonton");
            String namaPenonton = input2.nextLine();
            System.out.println("Pilih baris tempat duduk yang anda inginkan ");
            baris = input1.nextInt();
            System.out.println("Kolom : ");
            kolom = input1.nextInt();
            penonton [baris-1] [kolom-1] = namaPenonton;
        } else if (pilihan == 2){
            for (int i = 0; i < penonton.length; i++){
                System.out.println("Pada baris ke- " +(i+1) + " : "+penonton[i][0] +", "+penonton[i][1]);
            }
        } else if (pilihan == 3){
            System.out.println("Terimakasih telah memilih jasa kami");
            break;
        }
        }
    }
}