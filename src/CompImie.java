import java.util.Comparator;

public class CompImie implements Comparator<Pracownik> {
    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return o1.imie.compareTo(o2.imie);
    }
}
