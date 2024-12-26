package com.models;

import java.io.*;

public class StudentDetails implements Externalizable {

    @Serial
    private static final long serialVersionUID = 1L;

    private  String fName;
    private  String lName;
    private  Integer age;
    private  String  email;

    public StudentDetails(String fName, String lName, Integer age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

    public StudentDetails() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(fName);
        out.writeObject(lName);
        out.writeInt(age);

    }


    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       fName= (String) in.readObject();
       lName = (String) in.readObject();
       age = in.readInt();
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
