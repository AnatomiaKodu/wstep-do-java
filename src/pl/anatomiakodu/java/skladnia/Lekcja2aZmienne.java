package pl.anatomiakodu.java.skladnia;

public class Lekcja2aZmienne {

    public static void main(String[] args) {
        typyPrymitywne();
        typyObiektowe();
        operacjeNaTypachObiektowych();
        nullPrzyklad();
        przykladFinal();
        rzutowanie();
    }

    static void typyPrymitywne() {
        // Typy prymitywne
        byte malaLiczba1 = 127;
        byte malaLiczba2 = -128;
        short liczbaSredniejWielkosci1 = 32767;
        short liczbaSredniejWielkosci2 = -32768;
        int liczbaCalkowita = 822322342; // od -2^(31) do 2^(32) - 1
        long bardzoDlugaLiczba = 2312545454353423434L; // od -2^(63) do 2^(63) - 1

        float liczbaZmiennoprzecinkowaFloat = 132.000001f;
        double liczbaZmiennoprzecinkowaDouble = 143.000000000001d; // większa dokładność

        char literka = 'a';

        boolean warunek = true;
    }

    static void rzutowanie() {
        // Rzutowanie w klejności od najmniejszej dokładności do największej
        // byte -> short -> char -> int -> long -> float -> double
        int zmiennaShort = 1;
        long zmiennaLong = zmiennaShort;
        System.out.println("Moj int po rzutowaniu pozostaje bez zmian: " + zmiennaLong);

        // Rzutowanie w klejności od największej dokładności do najmniejszej
        // double -> float -> long -> int -> char -> short -> byte
        zmiennaLong = 1232132132133213L;
        zmiennaShort = (short) zmiennaLong;
        System.out.println("Moj short po rzutowaniu zmienił wartość: " + zmiennaShort);
    }

    static void przykladFinal() {
        // final to zmienne których nie można edytować
        final Double liczbaPi = 3.14d;
        Double wynik = 123.239;
        wynik = wynik + 1;
//        liczbaPi = liczbaPi + 1;
    }

    static void nullPrzyklad() {
        // wartość null - a w zasadzie brak żadnej wartości
        String nullTekst = null;
        String pustyTekst = "";
        Integer nullLiczba = null;
    }

    static void typyObiektowe() {
        // Typy Obiektowe są klasami. Przyjęto że są pisane z wielkiej litery.
        String tekst = "Hello world!";
        Integer liczba = 232434;
        Double liczbaZmiennoprzecinkowa = 23.2332d;
        // itd. ;)
    }

    static void operacjeNaTypachObiektowych() {
        // Typy Obiektowe - ich przykładowe pola oraz metody
        Integer maksymalnaLiczba = Integer.MAX_VALUE;
        Integer minimalnaLiczba = Integer.MIN_VALUE;

        Double wynik = 123.23;
        wynik.toString();
        wynik.compareTo(12.3d);
        wynik.equals(12d);
    }
}
