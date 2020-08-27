package hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HomeWork3 {

    public static void main(String[] args) {
//        Создаем массив для подсчета уникальных значений
        HashMap<String, Integer> entrees = new HashMap<>();

//        Создаем массив для уникальных значений
        HashSet<String> count = new HashSet<>();

//        Создаем наш массив с повторяющимися значениями и добавляем в него значения
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add("Box" + (int) (Math.random() * 4));

//        Так же добавляем эти значения в наш массив для уникальных значений
            count.add(words.get(i));

//        А так же создаем значения пара (ключ, занчение) для подсчета количества совпадений и
//        передаем их в массив
            String str = words.get(i);
            if (!entrees.containsKey(str)) {
                entrees.put(str, 1);
            } else {
                entrees.put(str, entrees.get(str) + 1);
            }
        }
//        Выводим наш массив со всеми значениями
        System.out.println(words.toString());

//        Выводим наш массив с уникальными значениями
        System.out.println(count);

//        Выводим наш масси в с уникальными значениями и показываем сколько раз встречается
//        тот или  иной элемент масива
        for (Map.Entry<String, Integer> counts : entrees.entrySet())
            System.out.println("Слово: " + counts.getKey() + ". Встречается в массиве " + counts.getValue() + " раз.");



    }
}


