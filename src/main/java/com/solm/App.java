package com.solm;

public class App
{
    public static void main( String[] args )
    {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(7);
        list.insertAtBeginning(5);
        list.insertAtPosition(8, 2);

        System.out.println("Linked List after insertions:");
        list.traverse();

        list.deleteFromBeginning();
        list.deleteFromEnd();
        list.deleteFromPosition(1);

        System.out.println("\nLinked List after deleting data:");
        list.traverse();

        int searchKey = 6;
        System.out.println("\nSearching for " + searchKey + ": " + list.search(searchKey));

        list.reverse();
        System.out.println("\nReversed list:");
        list.traverse();
    }

    }

