package com.example.recyclerviewexample;

public class Contacts {
   private String Name;
    private int image;
    private String phone;

    public Contacts(String name, int image, String phone) {
        Name = name;
        this.image = image;
        this.phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
