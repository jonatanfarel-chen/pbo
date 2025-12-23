/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demopenumpang;
import java.util.Scanner;
/**
 *
 * @author ICEBEAR
 */
public class DemoPenumpang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Penumpang : ");
        String nama = input.nextLine();

        System.out.print("Masukkan No Tiket       : ");
        String noTiket = input.nextLine();

        System.out.print("Jenis Penumpang (1=Reguler, 2=VIP): ");
        int pilihan = input.nextInt();

        Penumpang penumpang;

        if (pilihan == 1) {
            penumpang = new PenumpangReguler(nama, noTiket);
            penumpang.tampilkanData("Reguler");
        } else {
            penumpang = new PenumpangVIP(nama, noTiket);
            penumpang.tampilkanData("VIP");
        }
    }
}
