package com.fredericboisguerin.insa;


import java.util.ArrayList;

public class ContactsManager {

    ArrayList<Contact> list = new ArrayList<Contact>();

    public void addContact(String name, String email, String phoneNumber) {
        Contact contact = new Contact(name, email, phoneNumber);
        list.add(contact);
    }

    public void printAllContacts() {
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i).toString());
        }
    }

    public void searchContactByName(String name) {
        for(int i=0; i<list.size();i++){
            if(list.get(i).name.toLowerCase().contains(name.toLowerCase())){
                System.out.print(list.get(i).toString()+ "\n");
            };
        }
    }
}
