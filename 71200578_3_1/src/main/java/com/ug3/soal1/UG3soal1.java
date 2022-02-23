package com.ug3.soal1;


import java.util.Scanner;

public class UG3soal1
{
    public static void main( String[] args ) {
        String nama;
        String nim;
        String gender;
        String umur;
        Scanner scan = new Scanner(System.in);
        System.out.println("============Data Diri============");
        System.out.println("Masukkan data diri anda");
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("NIM: ");
        nim = scan.nextLine();
        System.out.print("Jenis Kelamin: ");
        gender = scan.nextLine();
        System.out.print("Umur: ");
        umur = scan.nextLine();

        System.out.println("============Data Diri============");
        System.out.println("Nama = " + nama);
        System.out.println("NIM = " + nim);
        System.out.println("Jenis Kelamin = " + gender);
        System.out.println("Umur = " + umur);

    }
}