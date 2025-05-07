package com.plurasight;

public class Student extends Person{

        private String github;
        private String linkedin;
        private String codingNickname;
        private String codewarsXPoints;
        private String imageURL;
        private int pageNumberWorkbook;
        private String currentlyWorkingOn;
        private int id;

    public Student(String firstName, String lastName, String email, String gender, String github, String linkedin, String codingNickname, String codewarsXPoints, String imageURL, int pageNumberWorkbook, String currentlyWorkingOn, int id) {
        super(firstName, lastName, email, gender);
        this.github = github;
        this.linkedin = linkedin;
        this.codingNickname = codingNickname;
        this.codewarsXPoints = codewarsXPoints;
        this.imageURL = imageURL;
        this.pageNumberWorkbook = pageNumberWorkbook;
        this.currentlyWorkingOn = currentlyWorkingOn;
        this.id = id;
    }
    public Student(){
        super();
        this.github = "";
        this.linkedin = "";
        this.codingNickname = "";
        this.codewarsXPoints = "";
        this.imageURL = "";
        this.pageNumberWorkbook = 0;
        this.currentlyWorkingOn = "";
        this.id = 0;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getCodingNickname() {
        return codingNickname;
    }

    public void setCodingNickname(String codingNickname) {
        this.codingNickname = codingNickname;
    }

    public String getCodewarsXPoints() {
        return codewarsXPoints;
    }

    public void setCodewarsXPoints(String codewarsXPoints) {
        this.codewarsXPoints = codewarsXPoints;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getPageNumberWorkbook() {
        return pageNumberWorkbook;
    }

    public void setPageNumberWorkbook(int pageNumberWorkbook) {
        this.pageNumberWorkbook = pageNumberWorkbook;
    }

    public String getCurrentlyWorkingOn() {
        return currentlyWorkingOn;
    }

    public void setCurrentlyWorkingOn(String currentlyWorkingOn) {
        this.currentlyWorkingOn = currentlyWorkingOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
