package ba.unsa.etf.rpr.tutorijal03;
import java.util.*;
public abstract class TelefonskiBroj {
    String broj;

    public abstract String ispisi();
    public abstract int hashCode();
    @Override
    public String toString(){
        return broj;
    }
}
