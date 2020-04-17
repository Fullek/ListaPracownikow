package demo;

public class Demo {

    public void zademonstrujProgram() {

        ArchiwumDanychOPracownikach archiwumDanychOPracownikach = new ArchiwumDanychOPracownikach();
        SerwisPracownikow serwisPracownikow = new SerwisPracownikow(archiwumDanychOPracownikach);

        serwisPracownikow.pokazPracownikow();
    }
}
