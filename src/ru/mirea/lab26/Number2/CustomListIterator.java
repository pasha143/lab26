package ru.mirea.lab26.Number2;
import java.util.Iterator;
import java.util.List;

public class CustomListIterator<T> implements Iterator<T> {

    private List<T> list;
    private int index;

    public CustomListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(index++);
        } else {
            throw new IndexOutOfBoundsException("В списке больше нет элементов");
        }
    }
}
