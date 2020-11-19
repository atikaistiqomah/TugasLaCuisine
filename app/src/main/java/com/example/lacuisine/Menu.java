package com.example.lacuisine;

public class Menu {
    private String Name;
    private String Price;
    private String Desc;
    private int Image;

    public Menu(String name, String price, String desc, int image) {
        Name = name;
        Price = price;
        Desc = desc;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }

    public String getDesc() {
        return Desc;
    }

    public int getImage() {
        return Image;
    }
}
