package ITERATOR;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        List arrylist = new ArrayList();
        arrylist.add(new Student(1931,"sasi",20,12345));
        arrylist.add(new Student(1931,"sandeep",20,12345));
        arrylist.add(new Student(1931,"hemu",20,12345));
        arrylist.add(new Student(1931,"lohith",20,12345));

        Iterator ite =  arrylist.iterator();
        while(ite.hasNext()){
            Student s1 = (Student) ite.next();
            s1.print();
        }

    }


}


