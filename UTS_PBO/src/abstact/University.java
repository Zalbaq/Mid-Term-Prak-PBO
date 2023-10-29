package abstact;

public abstract class University {
    protected String lokasi;

    public University(String lokasi) {
        this.lokasi = lokasi;
    }
    public abstract void getInfo();
}
