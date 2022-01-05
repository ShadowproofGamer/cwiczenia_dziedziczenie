import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Firma {
    public Pracownik[] firma;
    public int a;
    public Firma(int a){
        this.a = a;
        this.firma = new Pracownik[a];
    }
    public int ile=0;
    public void dodajPrac(Pracownik p){
        if(ile<a){
            firma[ile] = p;
            ile++;
        }else{
            System.out.println("Brak miejsca dla nowego pracownika");
        }
    }
    public void wyswietl(){
        for (int i=0;i<ile;i++){
            System.out.println(firma[i]);
        }
    }
    public void listaWyplat() {
        for (int i = 0; i < ile; i++) {
            System.out.println(firma[i] + " " + firma[i].wyplata());
        }
    }

    public void sortuj1(){
        Arrays.sort(firma, 0, ile, new CompImie());
    }
    public void sortuj2(Comparator<Pracownik> c){
        Arrays.sort(firma, 0, ile, c);
    }
}
