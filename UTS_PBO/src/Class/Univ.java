package Class;

import abstact.University;

public class Univ extends University {
    private String name, tipe = "Universitas";
    private double minNilai;

    public Univ(String name, String lokasi, double minNilai) {
        super(lokasi);
        this.name = name;
        this.minNilai = minNilai;
    }

    public String getName() {
        return name;
    }

    public String getTipe() {
        return tipe;
    }

    public double getMinNilai() {
        return minNilai;
    }

    public void setMinNilai(double minNilai) {
        this.minNilai = minNilai;
    }

    @Override
    public void getInfo() {
        System.out.println("Nama Kampus\t\t" + name);
        System.out.println("Tipe Kampus\t\t" + tipe);
        System.out.println("Lokasi Kampus\t\t" + lokasi);
    }
}