/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2024;

/**
 *
 * @author ASUS
 */
public class SoalEASno5 {
    public static int indeksElemenMin(int[] a){
        int min = a[0];
        int indeks = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]<min){
                min = a[i];
                indeks = i;
            }
        }
        return indeks;
    }
    public static void main(String[] args) {
        int[] nilai = {87, 68, 94, 98, 54, 78, 85, 54, 76, 87};
        int posisi;
        posisi = indeksElemenMin(nilai);// pemanggilan method
        System.out.println("Indeks dari elemen terkecil adalah: " + posisi);
    }
}
