package com.service;

import com.models.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {



    public  void demo() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/com/files/emp.sr");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) objectInputStream.readObject();
        System.out.println(employee.toString());
        objectInputStream.close();
        fileInputStream.close();

    }




}
