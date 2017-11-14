package com.fredericboisguerin.insa;

public class Contact{
    public String name;
    public String email;
    public String phoneNumber;

    public Contact(String name, String email, String phoneNumber) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        if(phoneNumber==null){
            return name +", " + email;
        }else if(email==null){
            return name + ", " + phoneNumber;
        }else{
            return name + ", " + email + ", " + phoneNumber;
        }

    }
}
