package hw3;

import java.util.*;

public class PhoneBook {
    HashMap<String, Set<Long>> phoneBook = new HashMap<>();

    public void add(String name, Long phone) {
        Set<Long> number = phoneBook.getOrDefault(name, new HashSet<>());
        number.add(phone);
        phoneBook.put(name, number);
    }

    public void add(String name, Long... phones) {
        Set<Long> numbers = phoneBook.getOrDefault(name, new HashSet<>());
        numbers.addAll(Arrays.asList(phones));
        phoneBook.put(name, numbers);
    }

    public Set<Long> get(String name) {
        return phoneBook.get(name);
    }
}
