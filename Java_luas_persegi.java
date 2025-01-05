/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_luas_persegi;
import java.util.Scanner;
/**
 *
 * @author PRIANTI MARATUL LUTH
 */
public class Java_luas_persegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan sisi Persegi :");
        double sisi=input.nextDouble();
        double luas= sisi * sisi;
        System.out.println ("Luas Persegi:"+luas);
    }
    
}
