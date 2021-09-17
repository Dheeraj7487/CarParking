package com.example.experement;

import java.util.HashMap;
import java.util.Map;

public class Credential {

    HashMap<String, String> credentialMapper = new HashMap<String, String>();


    public void addCredential(String Username, String Password) {
        credentialMapper.put(Username, Password);
    }


    public boolean checkusername(String Username) {
        return credentialMapper.containsKey(Username);
    }


    public boolean varifyCredential(String Username, String Password) {
        //check username exists
        if (credentialMapper.containsKey(Username)) {
            //check password match to username
            if (Password.equals(credentialMapper.get(Username))) {
                return true;
            }
        }
        return false;
    }

    public void loadCredential(Map<String, ?>  preferencesMap ){
        for (Map.Entry<String,?> entries:preferencesMap.entrySet()){
            if (!entries.getKey().equals("RememberMECheck")){
                credentialMapper.put(entries.getKey(),entries.getValue().toString());
            }
        }

    }



}