package com.plurasight;

import java.time.LocalDateTime;

public class Note {

    private int id;
    private String title;
    private String content;
    private String subject;
    private LocalDateTime current;

    public Note(int id, String title, String content, LocalDateTime current, String subject) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.current = current;
        this.subject = subject;
    }

    public Note() {
        this.id = 0;
        this.title = "";
        this.content = "";
        this.subject = "";
        this.current = LocalDateTime.now();

    }

    public void displayNote(){
        System.out.println("ID: " + getId() +
                           "Title: " + getTitle() +
                           "Content: " + getContent() +
                           "Time Created: " + getCurrent() +
                           "Subject: " + getSubject());
    }

    public void inputUserNote(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getCurrent() {
        return current;
    }

    public void setCurrent(LocalDateTime current) {
        this.current = current;
    }
}
