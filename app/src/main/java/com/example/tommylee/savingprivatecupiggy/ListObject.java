package com.example.tommylee.savingprivatecupiggy;

import android.widget.ImageView;

public class ListObject {
    private int image;
    private String name;
    private String fullname;
    private String address;

    public ListObject(int image, String name, String fullname, String address) {
        this.image = image;
        this.name = name;
        this.fullname = fullname;
        this.address = address;
    }
}
