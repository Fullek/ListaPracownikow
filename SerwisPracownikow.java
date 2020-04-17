package demo;

public class SerwisPracownikow {

    private ArchiwumDanychOPracownikach archiwumDanychOPracownikach;

    public SerwisPracownikow(ArchiwumDanychOPracownikach archiwumDanychOPracownikach) {
        this.archiwumDanychOPracownikach = archiwumDanychOPracownikach;
    }

    public void pokazPracownikow() {
        System.out.println(archiwumDanychOPracownikach.getPracownicy());
    }
}
