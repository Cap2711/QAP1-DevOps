package com.keyin;

import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {

        ArrayList<String> ToDo = new ArrayList<>();

        ToDo.add("Dishes");
        ToDo.add("Exercise");
        ToDo.add("Laundry");

        ToDoList todolist = new ToDoList();
        todolist.display(ToDo);

        //adding it to start if list
        insert(ToDo, 0, "Grocery Shopping");
        todolist.display(ToDo);

        insert(ToDo, 4, "Qap");
        todolist.display(ToDo);

        //Delete index 2
        delete(ToDo, 2);
        todolist.display(ToDo);
    }

    //display list method

    public void display(ArrayList<String> ToDo) {
        for(int i = 0; i < ToDo.size(); i++){
            System.out.println(i + 1 + ". " + ToDo.get(i));
        }
        System.out.println();
    }

    // insert method
    public static void insert(ArrayList<String> ToDo, int index, String x) {
        if (index >= 0 && index <= ToDo.size()) {
            ToDo.add(index, x);
        } else {
            System.out.println("Invalid index");
        }

    }

    // delete method
    public static void delete(ArrayList<String> ToDo, int index){
        if (index >= 0  && index <= ToDo.size()) {
            ToDo.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }



}