package com.ucx.training.sessions.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString(){
        return String.format("%s %s",this.age,this.name);
    }

    public static List<Person> filter(List<Person> people, CheckPerson checkPerson){
        List<Person> filteredPeople = new ArrayList<>();
        for (Person person : people){
            if (checkPerson.test(person)) {
                filteredPeople.add(person);
            }
        }
        return filteredPeople;
    }
}
