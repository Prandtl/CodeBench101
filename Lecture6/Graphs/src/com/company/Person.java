package com.company;

import java.util.ArrayList;

/**
 * Created by Vasiliy on 6/20/2015.
 */
public class Person {
    private String name;
    private ArrayList<Person> friends;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getFriends()
    {
        return friends;
    }

    public void addFriends(Person[] newFriends)
    {
        for(Person friend: newFriends){
            friends.add(friend);
        }
    }
}
