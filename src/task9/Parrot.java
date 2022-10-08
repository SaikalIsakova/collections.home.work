package task9;

public class Parrot extends Pet{
    private String name;
    private double flightAltitude;
    private String countryOfOrigin;
    private int wingBeatSpeed;

    public Parrot(String name,double flightAltitude, String countryOfOrigin, int wingBeatSpeed) {
        this.name=name;
        this.flightAltitude = flightAltitude;
        this.countryOfOrigin = countryOfOrigin;
        this.wingBeatSpeed = wingBeatSpeed;
    }

    public Parrot(String type, int age, String name,double flightAltitude, String countryOfOrigin, int wingBeatSpeed) {
        super(type, age);
        this.name=name;
        this.flightAltitude = flightAltitude;
        this.countryOfOrigin = countryOfOrigin;
        this.wingBeatSpeed = wingBeatSpeed;
    }

    public double getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(double flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getWingBeatSpeed() {
        return wingBeatSpeed;
    }

    public void setWingBeatSpeed(int wingBeatSpeed) {
        this.wingBeatSpeed = wingBeatSpeed;
    }

    @Override
    public String toString() {
        return "Имя : "+name+
                ", Высота полета :  " + flightAltitude +
                ", Страна проживания : " + countryOfOrigin + '\'' +
                ", Скорость взмаха крыльев : " + wingBeatSpeed;
    }
}
