package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.SARAJEVO;

public class Program {

    public static void main(String[] args) {
        Imenik imenik = new Imenik();
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        imenik.dodaj("Jozo Jozic", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        int unos = -1;
        while(unos != 0){
            System.out.println("Izaberi jedan od ponuđwnih brojeva: ");
            System.out.println("0. Izlaz");
            System.out.println("1. Daj mi od broj ovog čovjeka");
            System.out.println("2. Daj mi ime čovjeka čiji je ovo broj");
            System.out.println("3. Daj mi brojeve čije ime vlasnika počinje unesenim slovom");
            System.out.println("4. Daj mi brojve i ljude iz grada");
            Scanner ulaz = new Scanner(System.in);
            int unos = ulaz.nextInt();
            if(unos == 1) {
                System.out.println("Unesite ime čovjeka: ");
                String uneseni = ulaz.next();
                System.out.println("Traženi broj je:"+imenik.dajBroj(uneseni));
            }
            else if(unos == 2) {
                System.out.println("Unesite broj: ");
                TelefonskiBroj uneseni = ulaz.next();
            }

        }
    }
}