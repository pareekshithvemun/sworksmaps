package com.example.sworksmaps;

import org.json.JSONObject;



public class Orderdetails {

    private String mname;
    private String maddress;
    private String mphone;

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }



    public  Orderdetails(){}



    public Orderdetails(String name, String address, String phone) {
        this.mname = name;
        this.maddress = address;
        this.mphone = phone;

    }

    public String getMname() {
        return mname;
    }

    public String getMaddress() {
        return maddress;
    }

    public String getMphone() {
        return mphone;
    }










}
