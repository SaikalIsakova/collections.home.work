package task1;

public class HeavyBox implements Comparable<HeavyBox>{
    private double weight;

    public HeavyBox() {
    }

    public HeavyBox(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Коробка " +
                "Вес " + weight;
    }
    @Override
    public int compareTo(HeavyBox h) {
        return (int) (this.weight - h.weight);
    }
}
