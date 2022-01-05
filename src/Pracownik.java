import java.util.Comparator;

public abstract class Pracownik implements Comparable<Pracownik> {

    protected String imie;
    protected String nazwisko;
    protected int wiek;
    protected double etat;
    public Pracownik(String imie, String nazwisko, int wiek, double etat){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.etat = etat;
    }
    public double wyplata(){return 1000;};
    public boolean equals(Pracownik o){
        return (this.imie == o.imie && this.nazwisko == o.nazwisko && this.wiek == o.wiek);
    }
/*
    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return 0;
    }
*/
    public int compareTo(Pracownik p) {
        //int result = String.CASE_INSENSITIVE_ORDER.compare(this.imie, p.imie);
        int result = this.imie.compareTo(p.imie);
        if (result==0){
            //result = String.CASE_INSENSITIVE_ORDER.compare(this.nazwisko, p.nazwisko);
            result = this.nazwisko.compareTo(p.nazwisko);
            if (result==0){
                result = Integer.compare(this.wiek, p.wiek);
                if (result==0){
                    result = Double.compare(this.etat, p.etat);
                }
            }
        }
        return result;
    }
}
