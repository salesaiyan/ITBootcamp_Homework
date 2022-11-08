package Nedelja3;

import java.util.Arrays;

public class Ucenik {
    private String ime;
    private String prezime;
    private int godine;
    private int[] ocene;

    public Ucenik(String ime, String prezime, int godine, int[] ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.ocene = ocene;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public int getGodine() {
        return godine;
    }
    public int[] getOcene() {
        return ocene;
    }
    public void setGodine(int godine) {
        this.godine += 1;
    }
    public void setOcene(int[] ocene) {
        this.ocene = ocene;
    }
    public static String notifikacija(int[] ocene) {
        int brojJedinica = 0;
        String imaJedinicu = "";
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1) {
                brojJedinica++;
                imaJedinicu = "Imas " + brojJedinica + " jedinicu/e!";
            }
        }
        if (brojJedinica == 0) {
            imaJedinicu = "Nemas jedinicu, bravo!";
        }
         System.out.println(imaJedinicu);
        return imaJedinicu;
    }
    public static double prosek(int[] ocene) {
        double suma = 0;
        double prosek = 0;
        for (int i = 0; i < ocene.length; i++) {
            suma += ocene[i];
        }
        prosek = suma / ocene.length;
        System.out.println("Tvoj prosek ocena je: " + prosek);
        return prosek;
    }

    public static void main(String[] args) {
        Ucenik sasa = new Ucenik("Sasa", "Prokopijevic", 24, new int[] {1, 5, 5, 4, 1});

        notifikacija(sasa.getOcene());
        prosek(sasa.getOcene());
        sasa.setGodine(sasa.godine);
        System.out.println("Ti sad imas " + sasa.getGodine() + " godina!");
        sasa.setOcene(new int[] {5, 5, 4, 5});
        notifikacija(sasa.getOcene());
        prosek(sasa.getOcene());
    }
}
