// This class implements a Dynamic array from  Scratch
    // insert values (at last index)
    // dynamically change the array size to accommodate more elements without giving an indexoutofbound exception
    // remove values using an index
    // print the whole array
    // find the index of an element

package base;

public class Array {
    private int[] items;
    private int count;  //keep total number of elements inserted

    //assigning an array length
    public Array(int arrayLength){
        items = new int[arrayLength];
    }


    // inserting values to an array
    public void insert(int value){

        // if the array is full --> resize the array and copy/paste the values
        if(items.length == count){
            // Create new array 'newItems'
           int[] newItems = new int[ count*2 ];

           // copy paste elements of 'items' to 'newItems'
           for (int i = 0; i < count; i++) {
               newItems[i] = items[i];
           }

           // Set 'items' to this new array
            items = newItems;
        }

        // insert at the end of the array
        items[count] = value;
        count++;
    }


    // Remove elements from an array (by giving an index)
    public void removeAt(int index){

        // Validate the index (index doesn't exceed the array length and index is a valid value (-1)
        if ( index >= count || index < 0)
            throw new IllegalArgumentException();


        // Remove from the middle (Shift the items to left to fill the hole)
        // [10, 20, 30] --> removeAt(1) --> 20
        for(int i = index; i<count; i++){
            items[i] = items[i + 1];
        }
        count--;

    }


    // Find the index of an element
    public int indexOf(int value){
        for(int i = 0; i < count; i++){
            if( items[i] == value)
                return i;
        }
        return -1;
    }


    // Print the array elements
    // 1. Print all elements in an array (including 0's for empty memory spaces)
    public void printAll(){
        for (int i = 0; i < items.length; i++)
            System.out.println(items[i]);
    }

    // 2. Print only the elements (not extra empty memory spaces)
    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
