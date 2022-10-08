package task9;

public class Dog extends Pet{
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog(String type, int age, String name, String color) {
        super(type, age);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "Имя : " + name + '\'' +
                ", Окрас : " + color;
    }
}
