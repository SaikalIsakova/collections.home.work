package task9;

public class Pet {
    private String type;
    private int age;

    public Pet() {
    }

    public Pet(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Животное : " +
                "Тип : " + type + '\'' +
                ", Возраст : " + age +"\n";
    }
}
