package com.example.android.kolkatatour;

/**
 * Created by meghnabanerjee on 5/13/17.
 */

public class Attraction {
    private String name, address;
    private int imageResourceId;

    public Attraction(String name, String address,  int imageResouceId)
    {
        this.name =name;
        this.address = address;

        this.imageResourceId = imageResouceId;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }



    public int getImageResourceId()
    {
        return imageResourceId;
    }
}
