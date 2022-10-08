package task9;

public class Cat extends Pet{

    private String name;
    private boolean hasOwner;
    private String breed;

    public Cat(String name, boolean hasOwner, String breed) {
        this.name = name;
        this.hasOwner = hasOwner;
        this.breed = breed;
    }

    public Cat(String type, int age, String name, boolean hasOwner, String breed) {
        super(type, age);
        this.name = name;
        this.hasOwner = hasOwner;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return
                "Имя : " + name + '\'' +
                ", Есть ли хозяин : " + hasOwner +
                ", Порода : " + breed ;
    }
}
