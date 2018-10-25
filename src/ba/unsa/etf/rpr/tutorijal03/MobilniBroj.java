package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    int mobilnaMreza;
    String broj;

    public MobilniBroj(int mm, String br){
        mobilnaMreza = mm;
        broj = br;
    }

    @Override
    public int hashCode(){
       return mobilnaMreza;
    }

    @Override
    public String ispisi(){
        String vraceni = "";
        vraceni = 0 + mobilnaMreza + "/" + broj;
        return vraceni;
    }
}
