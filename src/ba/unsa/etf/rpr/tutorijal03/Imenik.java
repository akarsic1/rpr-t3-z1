package ba.unsa.etf.rpr.tutorijal03;
import javax.swing.text.html.parser.TagElement;
import java.util.HashMap<K,V>;

public class Imenik {
    HashMap<String,TelefonskiBroj> mapa = new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    String dajBroj(String ime){
        String povratni = mapa.get(ime).ispisi();
        return povratni;
    }

    String dajIme(TelefonskiBroj broj){
        String povratni = mapa.get(broj);

    }
}
