package ru.rusguardian;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords(){
        logininfo.put("Admin", "Abc123");
        logininfo.put("VincentVega", "Pooping");
        logininfo.put("GrayFox", "Zanzibara");
        logininfo.put("BigBoss", "MGS");
        logininfo.put("Kojima", "Genius");
        logininfo.put("Alexey", "BigDaddy");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
