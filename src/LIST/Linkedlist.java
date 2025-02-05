import java.util.*;

public class Linkedlist{
    public static void main(String[] args) {
        // class Node{
        //     public int data;
        //     public Node next;
        // }
        // Node node1 = new Node();
        // Node node2 = new Node(); 
        // node1.data = 1;
        // node1.next = node2; 
        // node2.data = 2;
        // node2.next = null;  
        // System.out.println(node1);
        // System.out.println(node1.next);
        // int temp = node1.next.data;
        // Node temp1 = node1.next;
        // System.out.println(node1.next.data);
        // System.out.println(temp);
        // System.out.println(temp1);
        // System.out.println(temp1.data);
        // System.out.println(temp1.next);
        // System.out.println(node2.next);
        //NO NEED OF ABOVE ALL CODE WE HAVE PREBUILT IN JAVA
        //WE CAN USE LINKEDLIST CLASS IN JAVA
        LinkedList<Integer> list = new LinkedList<>();
        //WE WANT TO WRITE LINKEDLIST ATARTING OF ABOVE ABOVE STATEMENT BECAUSE
        //WE WANT TO ACCESS ALL THE METHODS OF LINKEDLIST LIKE GETAFIRST,GETLAST,SET,REMOVE
        list.add(1); //TO ADDD NEW ELEMNT INTO LINKEDLIST
        list.add(1, 2); //WE CAN ADD AT ANY INDEX IN THE LIST;
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(0));//TO GET THE ELEMENT AT INDEX 0
        System.out.println(list.getFirst());//TO GET THE FIRST ELEMENT
        System.out.println(list.getLast());//TO GET THE LAST ELEMENT
        list.set(2, 3);//TO SET THE ELEMENT AT INDEX 2 (UPDATION)
        System.out.println(list);
        list.remove(1);//TO REMOVE THE ELEMENT AT INDEX 1
        System.out.println(list);
    }
}



//IF WE ARE LINKING NEW NODE TO THE LAST NODE OF THE LINKED LIST THEN WE HAVE TO TRAVERSE THE WHOLE 
//LINKED LIST TO GET THE LAST NODE
//IF WE DECLARE TEMP1 = NODE1.NEXT THEN WE CAN ACCESS THE DATA OF NODE2 USING TEMP1.DATA
//DIRECTLY TEMP1 IS AT TEMP2 SO WECAN ACCESS THE DATA AND NEXT OF NODE2 BY USING TEMP1

//A LINKED LIST IS A LINEAR DATA STRUTURE WHERE EACH ELEMENT IS A SEPERATE OBJECT IS CALLED NODE
//IIN JAVA THERE IS DOUBLY LINKES OR PREBULD LILKESLIST WHICH WORKS AS DOUBLY LINKED LIST
//IT HAS TWO POINTERS AND ONE DATA
//FIRST POINT WIIL POINT TO PREVIOUS NODDE AND SECONG POINTER POINTS TO NEXT NODE

//COMPRING TO ARRAYLIST LINKEDLIST IS SLOWER BECAUSE IT REQUIRES THE TRAVERSING OF THE WHOLE LIST
//AND IT IS FAST IN TERMS OF ADDITION AND DELECTION IN MODDLE OF THE LIST
//LINKED LIST TAKES MORE MEMORY COMPARING TO THE ARRAYLIST

//CRUD OPERATION IN LINKED LIST
//C -> CREATE LinkedList<Integer> "list name" = new LinkedList<>();
//R -> READ list.get(0) -> TO GET THE ELEMENT AT INDEX 0
//U -> UPDATE list.set(2, 3) -> TO SET THE ELEMENT AT INDEX 2 (UPDATION)
//D -> DELETE list.remove(1) -> TO REMOVE THE ELEMENT AT INDEX 1 (OR) we have removeAll() to remove all the elements

//CONVERTING ARRAY TI LINED LIST
//LinkedList<Intger> listname = new linkedList<>(Arrays.asList(array name))

