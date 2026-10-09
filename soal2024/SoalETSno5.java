/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2024;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SoalETSno5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        double[] data = new double[n];
        double sum = 0;

        // Input data observasi
        System.out.println("Masukkan " + n + " data (angka):");
        for (int i = 0; i < n; i++) {
            data[i] = input.nextDouble();
            sum += data[i];
        }

        // Hitung mean
        double mean = sum / n;

        // Hitung standar deviasi
        double jumlahSelisihKuadrat = 0;
        for (int i = 0; i < n; i++) {
            jumlahSelisihKuadrat += Math.pow(data[i] - mean, 2);
        }
        double sd = Math.sqrt(jumlahSelisihKuadrat / (n - 1));

        // Output hasil
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Mean (Rata-rata)        = " + mean);
        System.out.println("Standar Deviasi (SD)    = " + sd);
    }
}
