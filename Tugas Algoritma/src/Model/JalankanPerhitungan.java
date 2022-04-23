package Model;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(5,3,0);

        System.out.println("___________");
        System.out.println("Hasil pertambahan : ");
        int hasiltambahnya = s.hasiltambah(45,3);
        System.out.println(hasiltambahnya);

        System.out.println("___________");
        System.out.println("Hasil Perkalian : ");
        int hasilkalinya = s.hasilkali(55,70);
        System.out.println(hasilkalinya);
    }
}
