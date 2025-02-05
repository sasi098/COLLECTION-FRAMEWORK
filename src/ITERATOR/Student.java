package ITERATOR;

public class Student {
    public int id;
    public String name;
    public int age;
    public int adharr;

    public Student(int id,String name,int age,int adharr){
        this.id = id;
        this.name = name;
        this.age = age;
        this.adharr = adharr;
    }

    public void print(){
        System.out.println("name : " + name + " age is : " + age);
    }
}
