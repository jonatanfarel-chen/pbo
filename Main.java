/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ICEBEAR
 */
class Main extends InputPenumpang {
    public static void main(String[] args) {
        Main app = new Main();

        System.out.print("Masukkan Nama Penumpang : ");
        String nama = app.input.nextLine();

        System.out.print("Masukkan No Tiket       : ");
        String noTiket = app.input.nextLine();

        int pilihan;

        do {
            System.out.print("Jenis Penumpang (1=Reguler, 2=VIP): ");
            pilihan = app.input.nextInt();

            if (pilihan != 1 && pilihan != 2) {
                System.out.println("Pilihan tidak valid! Silakan pilih 1 atau 2.");
            }
        } while (pilihan != 1 && pilihan != 2);

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
