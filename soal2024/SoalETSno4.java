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

public class SoalETSno4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan Tiga Digit: ");
        int Bil = input.nextInt();
        
        int digit1 = (int)(Bil / 100);
        int sisa = Bil % 100;//opsional
        int digit3 = sisa %10;
        
        if(digit1 == digit3){
            System.out.print("Merupakan Palidrom");
        }else{
            System.out.print("Bukan Merupakan Palidrom");
        }
    }
}
