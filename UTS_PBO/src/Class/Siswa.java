package Class;

import abstact.Person;

public class Siswa extends Person{

    private double nilai;

    public Siswa(String name, int age, String tglLahir, double nilai) {
        super(name, age, tglLahir);
        this.nilai = nilai;
    }
    public double getNilai() {
        return nilai;
    }
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void dataDiri() {
        System.out.println("Nama\t\t\t: " + name);
        System.out.println("Tanggal Lahir\t: " + tglLahir);
        System.out.println("Umur\t\t\t: " + age);
        System.out.println("Nilai\t\t\t: " + nilai);
    }
}
