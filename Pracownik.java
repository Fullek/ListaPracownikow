package demo;

public class Pracownik {

    private String imie;
    private String nazwisko;

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return String.valueOf("Imię: " + imie + ", Nazwisko: " + nazwisko);
    }

}
