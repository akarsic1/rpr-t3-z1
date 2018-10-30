package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    int mobilnaMreza;
    String broj;

    public MobilniBroj(int mm, String br){
        mobilnaMreza = mm;
        broj = br;
    }



    @Override
    public int hashCode(){
       return 0;
    }

    @Override
    public String ispisi(){
        String vraceni = "";
        vraceni = "0" + mobilnaMreza + "/" + broj;
        return vraceni;
    }
}
