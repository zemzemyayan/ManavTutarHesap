package ManavTutarHesaplama;

import java.util.Scanner;

public class App {

    /*
     * Armut Kaç Kilo ? :0
     * Elma Kaç Kilo ? :1
     * Domates Kaç Kilo ? :1
     * Muz Kaç Kilo ? :2
     * Patlıcan Kaç Kilo ? :3
     * Toplam Tutar : 21.68 TL
     * 
     * Armut : 2,14 TL
     * Elma : 3,67 TL
     * Domates : 1,11 TL
     * Muz: 0,95 TL
     * Patlıcan : 5,00 TL
     * 
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Armut kaç kilo: ");
        float armut = sc.nextFloat();
        System.out.println("Elma kaç kilo :");
        float elma = sc.nextFloat();
        System.out.println("Domates kaç kilo: ");
        float domates = sc.nextFloat();
        System.out.println("Muz kaç kilo: ");
        float muz = sc.nextFloat();
        System.out.println("Patlıcan kaç kilo: ");
        float patlican = sc.nextFloat();
        float toplam = (armut * 2.14f) + (elma * 3.67f) + (domates * 1.11f) + (muz * 0.95f) + (patlican * 5.00f);
        System.out.println("Toplam Tutar: " + toplam);
        sc.close();

    }

}
