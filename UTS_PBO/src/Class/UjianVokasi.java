package Class;

public class UjianVokasi implements IUjian {
    Siswa camaba;
    Vokasi vokasi;
    String tipeUjian;

    public UjianVokasi(Siswa camaba, Vokasi vokasi, String tipeUjian) {
        this.camaba = camaba;
        this.vokasi = vokasi;
        this.tipeUjian = tipeUjian;
    }

    @Override
    public void doingTest() {
        if (this.camaba.getNilai() >= vokasi.getMinNilai()) {
            System.out.println("--------------------------------------------");
            System.out.println("\t\t\tSELAMAT ANDA LULUS");
            System.out.println("--------------------------------------------");
            camaba.dataDiri();
            System.out.println("Kampus Tujuan\t: " + vokasi.getName());
            System.out.println("Tipe Ujian\t\t: " + tipeUjian);
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("--------------------------------------------");
            System.out.println("\t\tMAAF ANDA TIDAK LULUS");
            System.out.println("--------------------------------------------");
            camaba.dataDiri();
            System.out.println("Kampus Tujuan\t: " + vokasi.getName());
            System.out.println("Tipe Ujian\t\t: " + tipeUjian);
            System.out.println("--------------------------------------------");
        }
        System.out.println();
    }
}
