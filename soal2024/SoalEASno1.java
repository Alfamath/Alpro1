/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2024;

/**
 *
 * @author ASUS
 */
public class SoalEASno1 {
    public static int kali(int a, int b){
        if(b == 1){
            return a;
        }else{
            return a+kali(a,b-1);
        }
    }
}
