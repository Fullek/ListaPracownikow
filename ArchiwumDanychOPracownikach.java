package demo;

import java.util.ArrayList;
import java.util.List;

public class ArchiwumDanychOPracownikach {

    private List<Pracownik> pracownicy = new ArrayList<>();

    public ArchiwumDanychOPracownikach() {
        pracownicy.add(new Pracownik("Jan", "Kowalski"));
    }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }
}
