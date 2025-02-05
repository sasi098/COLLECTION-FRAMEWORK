import java.util.*;


public class Vectors {
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);

    }
}

//JUST LIKE aRRAYLIST AND LINKEDLIST VECTOR ALSO DYNAMIC IN NATURE
//SAME LIKE ARRAYLIST WE HAVE 

//CCONVERTING ARRAY INTO VVECTOR
//Vector<Integer> vector = new Vector<>(Arrays.asList(array));

//RUD OPERATIOND
//C -> CREATE => Vector<Integer> vectorname = new Vector<>();
// add(E e): Adds an element at the end.
// • add(int index, E element): Inserts an element at the specified index.
// • get(int index): Retrieves the element at the specified index.
// • set(int index, E element): Replaces the element at the specified index.
// • remove(Object o): Removes the first occurrence of the specified element.
// • remove(int index): Removes the element at the specified index.
// • size(): Returns the number of elements in the vector.
// • isEmpty(): Checks if the vector is empty.
// • contains(Object o): Checks if the vector contains the specified element.
// • clear(): Removes all elements from the vector.


//VECTOR IS A SYNHRONIZED CLASS IN LIST
//ONLY ONE THREAD ACCESS THE ARRAY AT ON TIME
//VECTOR IS SLOWER THAN ARRAYLIST
//VECTOR IS USED IN MULTITHREADING ENVIRONMENT
