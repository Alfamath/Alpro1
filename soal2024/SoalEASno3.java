/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2024;

/**
 *
 * @author ASUS
 */
public class SoalEASno3 {
    public static int hitungHuruf(String kalimat){
        int jumlahVokal = 0;
        for(int i = 0; i < kalimat.length(); i++){
            char huruf = kalimat.charAt(i);
            if(huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }
    public static void main(String[] args) {
        String kalimat = "Padamu negeri";
        System.out.print("Jumlah huruf vokal pada kalimat: " + kalimat + " adalah " 
                +hitungHuruf(kalimat) + "\n");
    }
}
