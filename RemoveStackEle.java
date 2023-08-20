import java.util.*;
public class RemoveStackEle {
   public static void main(String args[])
   {
   //creating an empty stack
   Stack<Integer>stack=new Stack<Integer>();
   //use add method to add elements in the stack
   stack.add(-4);
   stack.add(6);
   stack.add(16);
   stack.add(46);
   stack.add(66);
   stack.add(88);
   //output the stack
   System.out.println("Stack:"+stack);
   //remove the element using remove()
   int rem_ele= stack.remove(5);
   //print the removed element
   System.out.println("Removed element:"+rem_ele);
   //print the final stack
   System.out.println("Final stack:"+stack);
   }
   }