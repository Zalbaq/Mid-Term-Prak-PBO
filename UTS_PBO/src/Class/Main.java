package Class;

public class Main {
    public static void main(String[] args) {
        Siswa budi = new Siswa("Budi", 18, "16 September 2003", 90);
        Siswa toni = new Siswa("Toni", 18, "23 November 2003", 70);

        Univ ui = new Univ("Universitas Indonesia", "Jakarta", 80);
        Vokasi polinema = new Vokasi("Politeknik Negeri Malang", "Malang", 90);

        UjianVokasi budiToPolinema = new UjianVokasi(budi, polinema, "Komputer");
        UjianUniv toniToUi = new UjianUniv(toni, ui, "Tulis");

        budiToPolinema.doingTest();
        toniToUi.doingTest();
    }
}
