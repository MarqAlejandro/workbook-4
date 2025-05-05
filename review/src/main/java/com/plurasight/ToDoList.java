package com.plurasight;

import java.util.ArrayList;
import java.util.Comparator;

class TodoList {
    private ArrayList<ToDoItem> tasks = new ArrayList<>();
    private String name;
    private float progress;

    public TodoList(String name) {
        this.name = name;
    }

    public void addItem(ToDoItem item) {
        tasks.add(item);
    }

    public void removeItem(ToDoItem item) {
        tasks.remove(item);
    }

    public void search(String keyword) {
        for (ToDoItem task : tasks) {
            if (task.getTitle().contains(keyword) || task.getContent().contains(keyword)) {
                System.out.println("Match: " + task.getTitle());
            }
        }
    }

    public void sort(Comparator<ToDoItem> comparator) {
        tasks.sort(comparator);
    }

    public void display() {
        for (ToDoItem task : tasks) {
            System.out.println("[Task] " + task.getTitle() + ": " + task.getContent());
        }
    }
}