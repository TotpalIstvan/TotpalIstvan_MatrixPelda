package hu.petrik.hu;

public class Main {

    public static void main(String[] args) {
	    Matrix m = new Matrix();
        System.out.println("Negyzetes-e:"+(m.isNegyzetes()?"igen":"nem"));

        System.out.println("A mátrix mérete: " + m.getSorokSzama() + " x " + m.getOszlopokSzama());
        System.out.println(m);
        System.out.println("\nA mátrix összege: " +m.Osszeg());
        System.out.println("\nA mátrix lévő páros számok száma: " +m.parosakSzama());
        System.out.println("\nA mátrix legnagyobb eleme: " +m.legnagyobbElem());
    }
}
