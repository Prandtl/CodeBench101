package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Person John = new Person("John");
        Person Elizabeth = new Person("Elizabeth");
        Person Booker = new Person("Booker");
        Person Henry = new Person("Henry");
        Person Alice = new Person("Alice");
        John.addFriends(new Person[]{Booker});
        Elizabeth.addFriends(new Person[]{Henry, Alice, Booker});
        Booker.addFriends(new Person[]{Alice, John, Elizabeth});
        Henry.addFriends(new Person[]{Elizabeth});
        Alice.addFriends(new Person[]{Booker});

        Person[] persons = new Person[]{John, Elizabeth, Booker, Henry, Alice};
        for (Person person : persons) {
            ArrayList<String> friendNames = new ArrayList<String>();
            for (Person friend : person.getFriends()) {
                friendNames.add(friend.getName());
            }
            String friendsString = "";
            for (String name : friendNames) {
                friendsString += name + ", ";
            }
            friendsString = friendsString.substring(0, friendsString.length() - 2);
            System.out.println(person.getName() + " got friends: " + friendsString);
        }

        dfs(persons,0);
    }

    public static void dfs(Person[] person, int index) {
        Stack<Person> stack = new Stack<Person>();
        stack.add(person[index]);
        HashSet<Person> visited = new HashSet<Person>();
        visited.add(person[index]);
        while (!stack.empty()) {
            Person chosen = stack.pop();
            System.out.println("chosen is " + chosen.getName());
            for (Person friend : chosen.getFriends()) {
                if (!visited.contains(friend)) {
                    System.out.println("got a new person in graph " + friend.getName());
                    stack.push(friend);
                    visited.add(friend);
                } else {
                    System.out.println("already visited: " + friend.getName());
                }
            }
        }
    }

    static void labyrinthCreator(){
        String[] stringVersion = new String[]{
                "11111",
                "10101",
                "10101",
                "10001",
                "11111"};
        ArrayList<Cell[]> workInProgress = new ArrayList<Cell[]>();
        for (String string : stringVersion) {
            ArrayList<Cell> row = new ArrayList<Cell>();
            for (int i = 0; i < string.length(); i++) {
                row.add(string.charAt(i) == '0' ?
                        new FreeCell() :
                        new Wall());
            }
            workInProgress.add(row.toArray(new Cell[row.size()]));
        }
        Cell[][] labyrinth = workInProgress.toArray(new Cell[workInProgress.size()][]);
    }


}
