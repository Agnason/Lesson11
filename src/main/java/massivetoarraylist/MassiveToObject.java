package massivetoarraylist;

import java.util.ArrayList;

public class MassiveToObject<T> {
    public T[] array;

    public MassiveToObject(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void print() {
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void swapFromTo(int indexFrom, int indexTo) {
        T val = null;
        val = array[indexFrom];
        array[indexFrom] = array[indexTo];
        array[indexTo] = val;
    }

    public ArrayList<T> change(T[] array) {
        ArrayList<T> listT = new ArrayList<>();
        for (Object i : getArray()) {
            listT.add((T) i);
        }
        System.out.println(listT);
        return listT;
    }
}



