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

public class SoalETSno3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Berat Badan Anda(kg): ");
        double berat = input.nextDouble();
        System.out.print("Massukan Tinggi Badan Anda(m): ");
        double tinggi = input.nextDouble();
        
        double BMI = berat/ (tinggi*tinggi);
        
        if (BMI >= 30.0){
            System.out.print("Resiko Anda: Berat");
        }else{
            if (BMI >= 25.0){
                        System.out.print("Resiko Anda: Sedang");
            }else{
                if (BMI >= 23.0){
                    System.out.print("Resiko Anda: Meningkat");
                }else{
                    if (BMI >= 18.5){
                System.out.print("Resiko Anda : Rata-rata");
                    }else{
                        if (BMI < 18.5){
                             System.out.print("Resiko Anda: Rendah(tapi resikomasalah klinis meningkat)");
                        }
                    }
                }
            }
        }
    }
}
