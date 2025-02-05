import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        Integer num = stack.pop();
        System.out.println(num);
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}


//STACK IS SUBCLASS OF vector (INHERITED FROM VETOR)
//IT USES LIFO


//TO GET TO ELEMENT IN STACK ==> stack.peek()

//CRUD OPERATION
//CREATE => Stack<Integer> stackname = new Stak<>();
//read => stackname.get(index);
//UPDATE => stackname.
//REMOVE => stackname.pop();

//TO GET SIZE OT LENGTH OF STACK => stackname.size();

//TO CHECK EMPTY => stackname.isempty();

//WE CAN DO ADD,SET,REMOVE,ADD AT INDEX IN STACK BECAUSE IT IS AN EXTENDED VERSION OF
//VECTOR .