package base;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;

        // Create a new node and insert a value
        public Node(int newValue){
            this.value = newValue;
        }
    }

    private Node firstNode;
    private Node lastNode;

    // Insert an item (to the end of LinkedList)
    public void insertLast(int item){
        Node node = new Node(item);

        // If the list is empty
        if (firstNode == null){
            firstNode = node;
            lastNode = node;
        } else {
            // If the list is not empty, append the new node to the end
            lastNode.next = node;
            lastNode = node;
        }
    }

    // Insert an item (to the start of LinkedList)
    public void insertFirst(int item){
        Node node = new Node(item);

        // If list is empty
        if (firstNode == null){
            firstNode = lastNode = node;
        } else {
            //append the new node
            node.next = firstNode;
            firstNode = node;
        }
    }

    // Returning the index when we give a value
    public int indexOf(int item){
        int index = 0;
        Node currentNode = firstNode;

        while (currentNode != null) {
            if ( currentNode.value == item )
                return index;
            else {
                currentNode = currentNode.next;
                index++;
            }
        }
        return -1;
    }

    // Check a value exists in the linked list
    public boolean contains(int item){
        if ( indexOf(item) >= 0)
            return true;
        return false;
    }

    // Removing a node from the list (First Node)
    public void removeFirst(){
        // remove if the list is not empty
        if ( firstNode != null ){
            // List with 1 node (Only First node exists)
            if ( firstNode.next == null ){
                firstNode = null;
            } else {
                // List with more than 1 node
                Node second = firstNode.next;
                firstNode.next = null; //removing the reference link and hence releasing the allocated memory space
                firstNode = second;
            }
        } else throw new NoSuchElementException();
    }

    // Remove Last node (Mosh's solution)
    public void removeLast(){
        // [10 -> 20 -> 30]
        // previous -> 20
        // last -> 20

        if ( firstNode == null)
            throw new NoSuchElementException();

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
            return;
        }

        Node previous = getPrevious(lastNode);
        lastNode = previous;
        lastNode.next = null;
    }

    // get previous node before the last node (Assists in removeLast method)
    private Node getPrevious(Node node) {
        var current = firstNode;
        while (current != null) {
            if (current.next == node) return current;
        }
        return null;
    }

    // Removing a node from the list (Last Node)
    public void removeLast2(){

        // remove if the list is not empty
        if ( firstNode != null ){
            // List with 1 node (Only First node exists)
            if ( firstNode == lastNode ){
                lastNode = null;
                firstNode.next = null;
                firstNode = null;
            } else {
                Node currentNode = firstNode;
                Node previousCurrentNode = null;

                while ( currentNode != null ){
                    previousCurrentNode.next = currentNode;
                    currentNode = currentNode.next;
                }
                lastNode = previousCurrentNode;
                lastNode.next = null;
            }
        } else throw new NoSuchElementException();

    }
}
