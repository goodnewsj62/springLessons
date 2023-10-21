package com.ltp.contacts.exception;

public class ContactNotFoundExecption extends RuntimeException {

    public ContactNotFoundExecption(String id ){
        super("The id '" +  id + "'  does not exist in our records");
    }
}
