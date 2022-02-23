public class Manufacture {
    protected String nameManufacture;
    protected String country;
    protected int sines;

    public Manufacture(String name, String country, int sines) {
        this.nameManufacture = name;
        this.country = country;
        this.sines = sines;
    }

    public String getNameManufacture() {
        return nameManufacture;
    }

    public String getCountry() {
        return country;
    }

    public int getSines() {
        return sines;
    }

    public void setNameManufacture(String nameManufacture) {
        this.nameManufacture = nameManufacture;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSines(int sines) {
        this.sines = sines;
    }
}
