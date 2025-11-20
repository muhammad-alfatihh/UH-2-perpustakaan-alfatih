/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uh;

/**
 *
 * @author muham
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UH {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> pinjaman = new ArrayList<>();

    public static void main(String[] args) {
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("\n=== Selamat Datang di library ===");
            System.out.println("1. Lihat daftar buku");
            System.out.println("2. Lihat pinjaman");
            System.out.println("3. Kembalikan buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            String penentu = input.nextLine();

            if (penentu.equals("1")) {
                listBuku();
            } 
            else if (penentu.equals("2")) {
                lihatPinjaman();
            }
            else if (penentu.equals("3")) {
                kembalikan();
            }
            else if (penentu.equals("4")) {
                kondisi = false;
                System.out.println("Keluar dari program...");
            }
            else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // Menampilkan daftar buku
    public static void listBuku() {
        System.out.println("\n=== Daftar Buku ===");
        System.out.println("1. Atomic Habits - James Clear");
        System.out.println("2. The 48 Laws of Power - Robert Greene");
        System.out.println("3. Rich Dad Poor Dad - Robert Kiyosaki");
        System.out.println("4. The Psychology of Money - Morgan Housel");
        System.out.println("5. How to Win Friends and Influence People - Dale Carnegie");
        System.out.print("Ketik angka untuk meminjam buku (0 untuk batal): ");

        String pilih = input.nextLine();

        switch (pilih) {
            case "1":
                pinjaman.add("Atomic Habits");
                System.out.println("Buku 'Atomic Habits' berhasil dipinjam!");
                break;
            case "2":
                pinjaman.add("The 48 Laws of Power");
                System.out.println("Buku 'The 48 Laws of Power' berhasil dipinjam!");
                break;
            case "3":
                pinjaman.add("Rich Dad Poor Dad");
                System.out.println("Buku 'Rich Dad Poor Dad' berhasil dipinjam!");
                break;
            case "4":
                pinjaman.add("The Psychology of Money");
                System.out.println("Buku 'The Psychology of Money' berhasil dipinjam!");
                break;
            case "5":
                pinjaman.add("How to Win Friends and Influence People");
                System.out.println("Buku 'How to Win Friends and Influence People' berhasil dipinjam!");
                break;
            case "0":
                System.out.println("Kembali ke menu utama...");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    // Menampilkan buku yang dipinjam
    public static void lihatPinjaman() {
        System.out.println("\n=== Buku yang Dipinjam ===");
        if (pinjaman.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam.");
        } else {
            for (String item : pinjaman) {
                System.out.println("- " + item);
            }
        }
    }

    // Mengembalikan buku
    public static void kembalikan() {
        System.out.println("\n=== Pengembalian Buku ===");
        if (pinjaman.isEmpty()) {
            System.out.println("Tidak ada buku untuk dikembalikan!");
            return;
        }

        System.out.println("Anda mengembalikan " + pinjaman.size() + " buku.");
        System.out.println("Buku berhasil dikembalikan!");

        pinjaman.clear();
    }
}
