package com.example.shmapp;

public class PostData {
    String name;
    String location;
    String time;
    String date;
    String form;

    PostData(){

    }

    public PostData(String name, String location, String time, String date, String form) {
        this.name = name;
        this.location = location;
        this.time = time;
        this.date = date;
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getForm() {
        return form;
    }
}
