public class main {
    public static void main(String[] args) {
        Firma f = new Firma(100);
        Urzednik p = new Urzednik("Jan", "Kowalski", 36, 1, 1000, 1.1);
        f.dodajPrac(p);
        Urzednik p2 = new Urzednik("Jan", "Kowalski", 37, 1, 400, 1.1);
        f.dodajPrac(p2);
        f.wyswietl();
        f.listaWyplat();
        System.out.println(p.equals(p2));
        System.out.println(p.compareTo(p2));
        System.out.println("sort1");
        f.sortuj1();
        System.out.println(f.firma);
        f.wyswietl();
        System.out.println("sort2");
        f.sortuj2(new CompImie());
        System.out.println(f.firma);
        f.wyswietl();
    }
}
