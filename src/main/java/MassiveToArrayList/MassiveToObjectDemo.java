package MassiveToArrayList;

import java.util.Arrays;
import java.util.List;

public class MassiveToObjectDemo {
    public static void main(String[] args) {

        MassiveToObject<Integer> array = new MassiveToObject<>(1,2,3,4,5);
        MassiveToObject<String> array2 = new MassiveToObject<>("Маша", "Оля", "Петя", "Вася");
        array.print();
        array.swapFromTo(0, 1);
        array.print();
        array2.print();
        array2.swapFromTo(0, 3);
        array2.print();
        array.change(array.array);
        array2.change(array2.array);


    }
}




