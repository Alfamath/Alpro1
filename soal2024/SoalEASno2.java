/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2024;

/**
 *
 * @author ASUS
 */
import java.util.Arrays;
public class SoalEASno2 {
    public static int[] minMatrix(int[][] avv){
        int[] result = new int[avv.length];
        for(int i = 0; i < avv.length; i++){
            result[i] = minArray(avv[i]);
        }
        return result;
    }
    public static int minArray(int[] arr){
        int min = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(minMatrix(matrix)));
    }
}
