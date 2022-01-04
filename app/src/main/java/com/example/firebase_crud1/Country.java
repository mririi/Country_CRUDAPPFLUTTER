package com.example.firebase_crud1;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Country implements Serializable
{


    @Exclude
    private String key;
    private String name;
    private String continent;
    public Country(){}
    public Country(String name, String continent)
    {
        this.name = name;
        this.continent = continent;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContinent()
    {
        return continent;
    }

    public void setPosition(String position)
    {
        this.continent = continent;
    }
    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }
}
