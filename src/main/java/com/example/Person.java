package com.example;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String passport;

    public Person(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Objects.isNull(obj) || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return age == other.age &&
                Objects.equals(name, other.name) &&
                Objects.equals(passport, other.passport);
    }

}
