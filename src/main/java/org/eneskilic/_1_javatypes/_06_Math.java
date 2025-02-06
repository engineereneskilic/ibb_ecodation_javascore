package org.eneskilic._1_javatypes;

import java.sql.SQLOutput;

public class _06_Math {

    public static void main(String[] args) {

        //NaN: Not A Number;

        System.out.println("En küçük: "+ Math.min(3,10));
        System.out.println("En büyük: "+ Math.max(-300,10));

        System.out.println("En büyük: "+Math.abs(-10));

        System.out.println("Karakök: " + Math.sqrt(Math.abs(-25)));

        System.out.println("Üstünü alma 7 nin 3 kuvveti: "+ Math.pow(7,3));

        System.out.println("Alt yuvarla: " + Math.floor(2.9));
        System.out.println("Alt yuvarla" + Math.ceil(2.1));
        System.out.println("Alt yuvarla" + Math.ceil(2.000001));
        System.out.println("Ortalama yuvarla: " + Math.round(3.4)); // aşağı ayarla
        System.out.println("Ortlama yuvarla: " + Math.round(3.5)); // x>= 5 ve yukarı yuvarla

        System.out.println("PI sayısı: " + Math.PI);
        System.out.println("E Sayısı: " + Math.E);

        System.out.println("Trigonometrik Sinüs: " + Math.sin(1));
        System.out.println("Trigonometrik Cosinüs: " + Math.cos(1));
        System.out.println("Trigonometrik Tanjant: " + Math.tan(1));
    }

}
