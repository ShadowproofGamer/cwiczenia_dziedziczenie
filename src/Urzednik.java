public class Urzednik extends Pracownik{
    private double placa;
    private double premia;
    public Urzednik(String imie, String nazwisko, int wiek, double etat, double placa, double premia){
        super(imie, nazwisko, wiek, etat);
        this.placa = placa;
        this.premia = premia;
    }
    @Override
    public String toString(){
        return super.toString()+"Urzednik "+wiek+" lat";
    }
    public double wyplata(){
        return placa*premia;
    }
}
