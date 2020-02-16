package com.company;

/*

0724 Family Census

Create a class Human with fields name (String), gender (boolean), age (int), father (Human), mother (Human).
Create objects and fill them so that it turns out: Two grandfathers, two grandmothers, a father, a mother, three children.
Display objects on the screen.

Note:
If you write your String toString () method in the Human class,
then it will be used when the object is displayed on the screen.
Output Example:
Name: Anya, gender: female, age: 21, father: Paul, mother: Katya
Name: Katya, gender: female, age: 55
Name: Igor, gender: male, age: 2, father: Mikhail, mother: Anya

Requirements:
1. The program should not read data from the keyboard.
2. Add fields to the Human class: name (String), gender (boolean), age (int), father (Human), mother (Human).
3. Add the constructor public Human to the class (String name, boolean sex, int age).
4. Add the constructor public Human to the class (String name, boolean sex, int age, Human father, Human mother).
5. Create 9 different objects of type Human (4 objects without father and mother and 5 objects with them)).
6. Display the created objects on the screen.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {

        Human grandFather = new Human("Eugene", true, 80);
        Human grandFather2 = new Human("Nicolas", true, 78);
        Human grandMother = new Human("Anne", false, 70);
        Human grandMother2 = new Human("Evdokiya", false, 90);
        Human father = new Human("Anatoliyi", true, 60, grandFather, grandMother);
        Human mother = new Human("Liubov", false, 63, grandFather2, grandMother2);
        Human sun = new Human("Viktor", true, 37, father, mother);
        Human daughter = new Human("Victoria", true, 27, father, mother);
        Human sun2 = new Human("Vasil", true, 17, father, mother);

        System.out.println(grandFather);
        System.out.println(grandFather2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sun);
        System.out.println(daughter);
        System.out.println(sun2);
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;
            if(this.father != null)
                text += ", father: " + this.father.name;
            if(this.mother != null)
                text += ", mother: " + this.mother.name;
            return text;
        }
    }
}








