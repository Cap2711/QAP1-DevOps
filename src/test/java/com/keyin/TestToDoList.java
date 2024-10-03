package com.keyin;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class TestToDoList {

    @Test
    public void testInsertAtValidIndex() {
        ArrayList<String> ToDo = new ArrayList<>();
        ToDo.add("Dishes");
        ToDo.add("Exercise");
        ToDo.add("Laundry");


        ToDoList.insert(ToDo, 2, "Grocery Shopping");
        //Test if the arraylist has 4 now and that grocery shopping is at index 2
        assertEquals(4, ToDo.size());
        assertEquals("Grocery Shopping", ToDo.get(2));
    }

    @Test
    public void testInsertAtInvalidIndex() {
        ArrayList<String> ToDo = new ArrayList<>();
        ToDo.add("Dishes");
        ToDo.add("Exercise");
        ToDo.add("Laundry");
        //Test insert
        ToDoList.insert(ToDo, 4, "Grocery Shopping");

        assertEquals(3, ToDo.size());
    }

    @Test
    public void testDeleteValidIndex() {
        ArrayList<String> ToDo = new ArrayList<>();
        ToDo.add("Dishes");
        ToDo.add("Exercise");
        ToDo.add("Laundry");

        ToDoList.delete(ToDo, 1);
        //Test delete methif
        assertEquals(2, ToDo.size());
        assertEquals("Laundry", ToDo.get(1));
    }
}
