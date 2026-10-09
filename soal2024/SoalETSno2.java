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

public class SoalETSno2 {
    public static void main(String[] args){
        Scanner Bil = new Scanner(System.in);
        
        System.out.print("Masukan bilangan bulat: ");
        int angka = (int) Math.abs(Bil.nextInt());
        
        int jumlah = 0;
        int sisa;
        
        while (angka != 0){
            sisa = angka % 10;
            if(sisa %2 != 0){
                jumlah +=sisa;
            }
            angka = angka / 10;
        }
        System.out.println("Jumlah angka dasar ganjil: " + jumlah);
    }
    
}
