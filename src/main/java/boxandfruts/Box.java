package boxandfruts;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<Float> box;
    private String boxType;

    public Box(ArrayList<Float> box, String boxType) {
        this.box = box;
        this.boxType = boxType;
        this.hashCode();
        System.out.println("Есть ящик под номером " + this.hashCode() + ". Он только для " + boxType);
    }

    public ArrayList<Float> getBox() {
        return box;
    }

    public float getWeight() {
        float totalWeight = 0l;
        for (Float portion : box) {
            totalWeight += portion;
        }
        System.out.println("Вес ящика " + hashCode() + " " + totalWeight);
        return totalWeight;
    }

    public boolean compare(Box another) {
        return (this.getWeight() == another.getWeight());
    }

    public void add(T fruit) {
        box.add(fruit.getFruitWeight() * fruit.getCount());
        System.out.println("В ящик " + this.hashCode() + " добавили " + fruit.getFruitWeight() * fruit.getCount() + " " + boxType);
    }

    public void pass(Box another) {
        box.addAll(another.box);
        another.box.clear();
        System.out.println("В ящик " + this.hashCode() + " переложили содержимое ящика " + another.hashCode());
    }
}

