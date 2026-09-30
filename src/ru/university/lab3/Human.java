package ru.university.lab3;

import java.util.Objects;
public class Human implements Comparable<Human>{
    private String lastName;
    private String firstName;
    private int age;

    public Human(String firstName, String lastName, int age){
        this.firstName = firstName; //this.firstName - поле класса, firstName - параметр
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
     public int getAge(){
        return age;
     }

    @Override
    public int compareTo(Human other){//правило сортировки
      int cmp = this.lastName.compareTo(other.lastName);
      if (cmp != 0){
          return cmp;
      }
      cmp = this.firstName.compareTo(other.firstName);
      if (cmp != 0){
          return cmp;
      }
      return Integer.compare(this.age, other.age);
    }
    @Override
    public boolean equals(Object o){
        if (this == o){ //если это тот же самый объект сразху true
            return true;
        }
        if (!(o instanceof Human)){ // еслине человек false
            return false;
        }
        Human human = (Human) o;
        return age == human.age && firstName.equals(human.firstName) && lastName.equals(human.lastName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age);
    }//Правило: если два объекта равны по equals, у них должны быть одинаковые hashCode.

    @Override
    public String toString(){
        return firstName + " " + lastName + " (" + age + ")";
    }
}
