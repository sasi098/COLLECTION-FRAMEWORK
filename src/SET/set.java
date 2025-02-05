import java.util.*;

public class set{
    public static void main(String[] args) {
        Set<Integer> sets = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        sets.add(1);
        sets.add(2);
        // Accessing particular element in a set is not straightforward as it does not support indexing.
        // One way to access a particular element is to iterate through the set.
        for (Integer element : sets) {
            if (element == 3) { // Example: accessing element 3
            System.out.println("Found element: " + element);
            break;
            }
        }//SET DOES NOT HAVE GET MEHTOD TO ACCESS PARTICULAR ELEMENT 
        //SO WE ARE RUNNING LOOP TO GET PARTICULAR ELEMENT
        sets.remove(2);
        System.out.println(sets);
        // System.out.println(sets.get(2)); // Set does not have a get method
        for(int i : sets){
            System.out.println(i);
        }
        // System.out.println(sets[3]); // Set does not support indexing
    }
}

//SET IS SAME LIKE
//HASHSET IS CHILD CLASS OF SET
//CREATE => Set<Integer> setnaame = new HashSet<Inetger>();
//ADDING ELEMENTS  => setname.add(element);
//ADDING AT POISTION => 
//REMOVING OBJECT => setname.remove(object);
//