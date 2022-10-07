package task8;

public class Student {
    private String name;
    private String course;
    private int group;
    private int rating;

    public Student() {
    }

    public Student(String name, String course, int group, int rating) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Студент = " +
                " Имя : " + name + '\'' +
                ", Курс : " + course + '\'' +
                ", Группа : " + group +
                ", Средняя успеваемость : " + rating + "\n";
    }
}
