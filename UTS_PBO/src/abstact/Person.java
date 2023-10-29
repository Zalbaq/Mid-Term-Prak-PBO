package abstact;
public abstract class Person{
    protected String name;
    protected  int age;
    protected String tglLahir;

    public Person(String name, int age, String tglLahir) {
        this.name = name;
        this.age = age;
        this.tglLahir = tglLahir;
    }

    public abstract void dataDiri();
}
