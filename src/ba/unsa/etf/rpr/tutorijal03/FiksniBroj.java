package ba.unsa.etf.rpr.tutorijal03;
import java.util.*;

public class FiksniBroj extends TelefonskiBroj{
    public enum Grad {
        SARAJEVO, TUZLA, TRAVNIK,ORAŠJE,
        ZENICA,LIVNO,MOSTAR,BIHAĆ,GORAŽDE,
        ŠIROKIBRIJEG
    }
    String broj;
    Grad grad;

    public Grad getGrad() {
        return grad;
    }


    @Override
    public int hashCode(){
        return 0;
    }

    public FiksniBroj(Grad gr, String br){
        grad = gr;
        broj = br;
    }

    /*@Override
    public String toString(){
        String za_ispis = "";
        int pozivni = hashCode(this.grad);
        za_ispis = 0+pozivni+"/"+this.broj;
        return za_ispis;
    }*/

    public int pozivniZaGrad(Grad grad){
        int pozivni = 0;
        if(grad == Grad.SARAJEVO)pozivni = 33;
        else if(grad == Grad.TUZLA)pozivni = 35;
        else if(grad == Grad.TRAVNIK)pozivni = 30;
        else if(grad == Grad.ORAŠJE)pozivni = 31;
        else if(grad == Grad.ZENICA)pozivni = 32;
        else if(grad == Grad.LIVNO)pozivni = 34;
        else if(grad == Grad.MOSTAR)pozivni = 36;
        else if(grad == Grad.BIHAĆ)pozivni = 37;
        else if(grad == Grad.GORAŽDE)pozivni = 38;
        else pozivni = 39;
        return pozivni;
    }

    @Override
    public String ispisi(){
        String za_ispis = "";
        int pozivni =pozivniZaGrad(this.grad);
        za_ispis = "0"+pozivni+"/"+this.broj;
        return za_ispis;
    }


}
