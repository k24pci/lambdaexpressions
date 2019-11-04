package com.ucx.training.sessions.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {
    public static void main(String[] args) {
        Person p1 = new Person("Flaka",13);
        Person p2 = new Person("Tina",12);
        Person p3 = new Person("Lorik",14);
        Person p4 = new Person("Vjollca",15);
        Person p5 = new Person("Fita",16);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);

        List<Person> filteredList = personList
                .stream()
                .filter(person -> person.getAge() < 15)
                .filter(person -> person.getName().startsWith("F"))
                .collect(Collectors.toList());

        System.out.println(filteredList);

        List<Integer> ages = personList.stream().map(person -> person.getAge()).collect(Collectors.toList());

        System.out.println(ages);

        Double average = personList.stream().mapToInt(person -> person.getAge()).average().getAsDouble();

        System.out.println(average);

        Comparator<Person> comperator = Comparator.comparing(e -> e.getAge());
        List<Person> sortedList = personList.stream().sorted(comperator.reversed()).collect(Collectors.toList());

        System.out.println(sortedList);


    }
}
