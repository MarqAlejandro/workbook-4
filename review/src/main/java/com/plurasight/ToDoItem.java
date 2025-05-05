package com.plurasight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

class ToDoItem extends Note {
    private boolean isCompleted;
    private LocalDate dueDate;
    private String priority;
    private Duration timer;

    public ToDoItem(int id, String title, String content, LocalDateTime current, String subject,
                    boolean isCompleted, LocalDate dueDate, String priority) {
        super(id, title, content, current, subject);
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
        this.priority = priority;
    }


    // Getters and Setters
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public Duration getTimer() { return timer; }
    public void setTimer(Duration duration) { this.timer = duration; }

    // Additional Methods
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public void updateContent(String newDescription) {
        setContent(newDescription);
    }

    public void updateTitle(String newTitle) {
        setTitle(newTitle);
    }

    public void clearItem() {
        setTitle("");
        setContent("");
        this.isCompleted = false;
        this.dueDate = null;
        this.priority = null;
        this.timer = null;
    }
}