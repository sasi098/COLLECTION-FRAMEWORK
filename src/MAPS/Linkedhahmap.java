import java.util.*;

public class Linkedhahmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedhash = new LinkedHashMap<>(16,0.25f,true);
        linkedhash.put("SASI",1931);
        linkedhash.put("RAMESH",1990);
        linkedhash.put("KISHORE",1995);
        System.out.println(linkedhash);
        for(Map.Entry<String,Integer> entry : linkedhash.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //AFTER THIS THE ORDER OF HASHMAP IS CHANGED ==> LRUCACHING (// least recently uses)
        System.out.println(linkedhash.get("SASI"));
        System.out.println(linkedhash);
    }
}


//LINKED HAHMAP IS SUBCLASS OF HASHMAP
//IN LINKED HASHMAP ORDER IS MAINTAINED MEANS 
//WE CAN GET OUT PUT SAME AS LIKE WE INSERTED
//IT CONTAINS DOUBLY LINKED LIST
//SO IT TAKES MORE TIMR COMPARING TO HASHMAP

//LATEST ACCESSING IS SORTED TO LAST
//IT TRACK TEH ACTVITTY
//WE WANT TO SET 
//LRU CAHCING