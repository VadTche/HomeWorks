package org.apache.maven.homeworks;
class Person {
    String name, position, email;
    int phone, salary, age;
    Person (String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this. salary = salary;
        this.age = age;
    }
    void getInform() {
        System.out.println("name:" +name+ " position:" +position+ " email:" +email+ " phone:" +phone+ " salary:" +salary+ " age:" +age);
    }
    int getAge() {
        return age;
    }
}

public class Lesson_5 {
public static void main(String[] args) {
    Person[] person = new Person[5];
    person[0] = new Person("John Firstson", "lead", "jfirst@gmail.com", 19991111, 50000, 45);
    person[1] = new Person("Jim Secondson", "qa", "jsec@gmail.com", 1999222, 40000, 45);
    person[2] = new Person("Dan Thirdson", "qc", "dthird@gmail.com", 1999333, 35000, 35);
    person[3] = new Person("Tom Fourthson", "coder", "tfour@gmail.com", 19994444, 36000, 35);
    person[4] = new Person("Ann Fifthson", "coder", "afifth@gmail.com", 19995555, 34000, 25);

    for (Person i : person)
        if (i.getAge() > 40) i.getInform();
}
}
