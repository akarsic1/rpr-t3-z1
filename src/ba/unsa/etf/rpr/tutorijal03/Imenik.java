package ba.unsa.etf.rpr.tutorijal03;
import javax.swing.text.html.parser.TagElement;
import java.util.*;

public class Imenik {
    HashMap<String,TelefonskiBroj> mapa = new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime){
        String povratni = mapa.get(ime).ispisi();
        return povratni;
    }

    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()){
            if(entry.getValue() == broj)return entry.getKey();
        }
        return "";
    }

    public String naSlovo(char s){
        int i = 1;
         for(Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()){
            if(entry.getKey().charAt(0) == s) return  i+" "+entry.getKey()+" - "+entry.getValue();
            i++;
        }
        return "";
    }

    public Set<String> izGrada(FiksniBroj.Grad g){
        Set<String> zavratiti = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()){
            if(entry.getValue() instanceof FiksniBroj && ((FiksniBroj) entry.getValue()).getGrad().equals(g)){
                zavratiti.add(entry.getKey());
            }
        }
        return  zavratiti;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> zavratiti = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : mapa.entrySet()){
            if(entry.getValue() instanceof FiksniBroj && ((FiksniBroj) entry.getValue()).getGrad().equals(g)){
                zavratiti.add(entry.getValue());
            }
        }
        return  zavratiti;
    }

}
