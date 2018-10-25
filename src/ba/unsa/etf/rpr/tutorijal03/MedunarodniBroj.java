package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{
    String drzava, broj;

    public MedunarodniBroj(String dr, String br){
        drzava = dr;
        broj = br;
    }

    @Override
    public String ispisi(){
        String s = "";
        s = drzava + "/" + broj;
        return s;
    }

    @Override
    public int hashCode(){
        int i = 0;
        return i;
    }

}
