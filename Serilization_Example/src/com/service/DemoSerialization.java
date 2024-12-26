package com.service;

import com.models.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {

    public void  demo() throws IOException {
        Employee employee =new Employee("JACK",123,"jack@jbc.com","ADMIN");
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/files/emp.sr");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
