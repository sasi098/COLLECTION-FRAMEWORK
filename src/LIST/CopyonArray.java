
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonArray {
    public static void main(String[] args){
        CopyOnWriteArrayList<Integer> cw = new CopyOnWriteArrayList<>();
        cw.add(1);
        cw.add(2);
        cw.add(3);
        System.out.println(cw);
        for(int i=0;i<cw.size();i++){
            if(cw.get(i) == 3){
                int k = cw.get(i) + 3;
                cw.set(i,k);
            }
        }
        System.out.println(cw);
    }
}

//CopyOnWriteArrayList IS USED WHEN WE WANT TO CHANGE THE LIST WHILE READING THE LIST OR TRAVERSING THE LIST
//IT MAKES A NEW CAOPY OF OLD LIST WHEN WE WANT TO PERFORM WRITE OPERATION ON THE LIST
//IT TAKES MORE MEMORY COMPARING TO ALL OTHERS


//CRUD OPERATION SMA EAS ARRAYLIST
