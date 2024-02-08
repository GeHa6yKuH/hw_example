package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 2, 5, 67, 15, 30, 89, 4, 5);
//        int[] arr = {65, 87, 65, 89, 76, 0};
//
//
//        List<Integer> list1 = list.stream()
//                .filter(digit -> digit % 2 == 0)
//                .map(el -> el * el)
//                .sorted()
//                .toList();
//        System.out.println(list1);

        // 1 task

        List<Integer> list3 = list.stream()
                .filter(digit -> digit % 2 == 1)
                .toList();

        // 2 task

        List<String> strings = new ArrayList<>();
        strings.add("23");
        strings.add("56");
        strings.add("89");
        strings.add("56");
        strings.add("90");

        List<Integer> listInts = new ArrayList<>();
        strings.forEach(el -> listInts.add(Integer.parseInt(el)));

        // 3 task

        AtomicInteger sum = new AtomicInteger();
        list.forEach(sum::addAndGet);
        System.out.println(sum);

        // 4 task

        Optional<Integer> optionalInteger = list.stream()
                .max(Comparator.naturalOrder());
        System.out.println(optionalInteger);

        // 5 task

        List<String> strings1 = new ArrayList<>();
        strings1.add("Abra kadabra");
        strings1.add("Ne abra kadabra");
        List<String> stringi = strings1.stream()
                .filter(st -> st.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(stringi);

        // 6 task

        List<String> strings2 = new ArrayList<>();
        strings2.add("Palka");
        strings2.add("Reka");
        strings2.add("Palka");
        strings2.add("Log");
        strings2.add("Alfavit");
        strings2.add("Solnce");

        List<String> stringList = strings2.stream()
                .filter(st -> st.length() > 4)
                .distinct()
                .toList();
        System.out.println(stringList);

        // 7 task

        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrey", 56));
        people.add(new Person("Andrey", 45));
        people.add(new Person("Anatoli", 61));
        people.add(new Person("Bogdan", 23));
        people.add(new Person("Mihail", 19));

        List<String> stringList1 = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::toString)
                .toList();
        System.out.println(stringList1);

        // 8 task

        int sum1 = list.stream()
                .filter(inta -> inta % 3 == 0)
                .filter(inta -> inta % 5 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum1);

        // 9 task

        List<String> stringList2 = strings2.stream()
                .filter(st -> {
                    char[] chars = st.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        for (int j = i + 1; j < chars.length; j++) {
                            if (chars[i] == chars[j]) return false;
                        }
                    }
                    return true;
                })
                .toList();
        System.out.println(stringList2);


     }
}
