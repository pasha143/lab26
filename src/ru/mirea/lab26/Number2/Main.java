package ru.mirea.lab26.Number2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("pasha");
        names.add("yan");
        names.add("fedor");

        CustomListIterator<String> iterator = new CustomListIterator<>(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
