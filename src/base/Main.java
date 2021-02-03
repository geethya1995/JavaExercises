package base;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* //Testing of the Implementation of Dynamic Arrays in Java
        //(Implementation can be found in Array.java)

        Array numbers = new Array(2);
        numbers.printAll();     (print all elements with 0's for empty memory spaces)
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);
        numbers.removeAt(0);
        System.out.println(numbers.indexOf(4));
        numbers.print();
         */


        /* //Dynamic arrays using Array Lists in Java
        //(Fun Fact --> When using array lists, it will reside 150% when it gets full)

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.get(1);
        list.toArray(); //get converted to a static array
        System.out.println(list);
         */


        /* //Linked Lists in Java

        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList list = new LinkedList();  // can add any type of objects (int, string)
        list.add(10);
        list.add(20);
        System.out.println(list);
         */


         /* //Testing of the Implementation of Linked-lists in Java
        //(Implementation can be found in LinkedList.java)
        LinkedList list = new LinkedList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30); // Add a breakpoint and debug since (we've not written print method)
        list.insertFirst(15);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(200));
        System.out.println(list.contains(30));
          */

    }
}
