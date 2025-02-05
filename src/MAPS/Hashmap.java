import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap{
    public static void main(String[] args){
        HashMap<Integer,String> hashmap = new HashMap<>();
        //      KEY    ,VALUE
        hashmap.put(1,"sasi");
        hashmap.put(2,"ram");
        hashmap.put(3,"krishna");
        System.out.println(hashmap);
        String name = hashmap.get(3);
        System.out.println(name);
        System.out.println(hashmap.containsKey(2));//O(1) time complexity
        System.out.println(hashmap.containsValue("sasi"));//O(1) TIME COMPLEXXITY
        System.out.println(hashmap.size());
        // hashmap.set(2,"hi"); WE CANT USE IT DIRECTLY
        
        //TO ITERATE THROUGH THE HASHMAP
        //1)GET THE KeyS
        //2)AND THEN RUN A FOR LOOP THROUGH THE LIST

        Set<Integer> keys = hashmap.keySet();//KEYSET RETURNS ONLY VALUE BUT ENTRY SET
        //RETURNS BOTH KEYS AND ITS CORRESPOONDING VALUES
        for(int i : keys){
            if(hashmap.get(i).equals("sasi")){
                System.out.println("found");
            }
            System.out.println(hashmap.get(i));
        }//THIS METHOD ONLY USE USEFUL FOR ACCESSING VALUES FROM KEYS

        // for(int i=0;i<hashmap.size();i++){
        //     System.out.println(hashmap.get(i));
        // } ITS NOT PREFERD BECAUSE EVERY TIME KAYS NEED NOT TO BE IN WSEQUENTIAL RIGHT

        Set<Map.Entry<Integer,String>> entries = hashmap.entrySet();
        //HERE ENTRIES CONSISTS OF BOTH KEY AND VALUE TWO VLAUES
        //HERE GETKEY() AND GETVALUE() IS USED FOR PATICULAY ENTRY IN THE LOOP
        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + " REFERS TO THR VALUE IS " + entry.getValue());
            System.out.println(entry.getValue().toLowerCase());
            
        }

        //STORTING OJECTS AS KEYS
        HashMap<Student,Integer> hashobj = new HashMap<>();
        Student s1 = new Student("sasi",1931);
        Student s2 = new Student("ram",1777);
        Student s3 = new Student("yashi",1509);
        hashobj.put(s1,90);
        hashobj.put(s2,95);
        hashobj.put(s3,98);
        System.out.println(hashobj);
        System.out.println(hashobj.get(s1));
        System.out.println(s1.getname());
    }
}


class Student{
    private String name;
    private int id;

    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getname(){
        return name;
    }

    public int getid(){
        return id;
    }
}

//CRUD OPRATION
//C --> CREATE -> HashMap<Integer,Integer> hashmap = new HashMap<>(); (FIRST ON)
//INSERT -> hashmap.put(key,value) . if the any entry in string use ""
//DELETEE -> hashmap.remove(key)
//UPADATE -> hashmaap.setValue();


//TO GET VALUE BY USING KEYS --> USING GET MEHTOD
//NO USE OF VALUE IN THE ACESSING OR GET PROCESS
//USE ONLY KEY TO ACCESS THE THINGS
//set operation -> getValue()