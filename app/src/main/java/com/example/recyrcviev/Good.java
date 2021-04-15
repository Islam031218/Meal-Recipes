package com.example.recyrcviev;

public class Good {
    private  int imageResource;
    private String header;
    private  String description;
    private String  time;


    public Good(int imageResource, String header, String description, String  time) {
        this.imageResource = imageResource;
        this.header = header;
        this.description = description;
        this.time = time;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }

    public String  getTime() {
        return time;
    }
}
