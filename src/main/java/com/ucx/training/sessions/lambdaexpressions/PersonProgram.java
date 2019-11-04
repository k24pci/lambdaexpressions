package com.ucx.training.sessions.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class PersonProgram {
    public static void main(String[] args) {
        Person p1 = new Person("Flaka",13);
        Person p2 = new Person("Tina",12);
        Person p3 = new Person("Lorik",14);
        Person p4 = new Person("Vjollca",15);
        Person p5 = new Person("Fita",16);

        CheckPerson checkPerson = new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getAge() > 14;
            }
        };

        CheckPerson checkPerson1 = (Person p) -> p.getAge() > 14;

        System.out.println("Age:" + checkPerson1.test(p4));

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);

        System.out.println(Person.filter(personList, p -> p.getName().startsWith("T")));

        personList.forEach(e -> System.out.println(e));
    }
}
