package Class;

public class UjianUniv implements IUjian {
    Siswa camaba;
    Univ univ;
    String tipeUjian;


    public UjianUniv(Siswa camaba, Univ univ, String tipeUjian) {
        this.camaba = camaba;
        this.univ = univ;
        this.tipeUjian = tipeUjian;
    }

    @Override
    public void doingTest() {
        if (this.camaba.getNilai() >= univ.getMinNilai()){
            System.out.println("--------------------------------------------");
            System.out.println("\t\t\tSELAMAT ANDA LULUS");
            System.out.println("--------------------------------------------");
            camaba.dataDiri();
            System.out.println("Kampus Tujuan\t: " + univ.getName());
            System.out.println("Tipe Ujian\t\t: "+ tipeUjian);
            System.out.println("--------------------------------------------");
        } else{
            System.out.println("--------------------------------------------");
            System.out.println("\t\tMAAF ANDA TIDAK LULUS");
            System.out.println("--------------------------------------------");
            camaba.dataDiri();
            System.out.println("Kampus Tujuan\t: " + univ.getName());
            System.out.println("Tipe Ujian\t\t: "+ tipeUjian);
            System.out.println("--------------------------------------------");
        }
        System.out.println();

    }
}
