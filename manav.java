package ders1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double akg,ekg,dkg,mkg,pkg,toplam;
        System.out.print("Armut kaç kilo?:");
        akg = input.nextDouble();
        System.out.print("Elma kaç kilo?:");
        ekg = input.nextDouble();
        System.out.print("Domates kaç kilo?:");
        dkg = input.nextDouble();
        System.out.print("Muz kaç kilo?:");
        mkg = input.nextDouble();
        System.out.print("Patlıcan kaç kilo?:");
        pkg = input.nextDouble();
        toplam = (akg*armut)+(ekg*elma)+(dkg*domates)+(mkg*muz)+(pkg*patlican);
        System.out.print("Toplam Tutar:"+toplam);
        System.out.print("TL");

    }
}
