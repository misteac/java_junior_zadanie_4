package ru.geekbrains.seminar_4.school;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "pupils")
public class Pupil {

    private static final String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    private static final Random random = new Random();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    public Pupil() {

    }

    public Pupil(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Pupil create(){
        return new Pupil(names[random.nextInt(names.length)], random.nextInt(10, 16));
    }



    public void updateAge(){
        age = random.nextInt(10, 16);
    }

    public void updateName(){
        name = names[random.nextInt(names.length)];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
