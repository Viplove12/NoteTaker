package com.example.dell.notetaker;

/**
 * Created by DELL on 9/18/2017.
 */

public class Note {
    private int id;
    private String title="";
    private String description="";

    public Note(){}

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription(){
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {this.id = id;    }
}
