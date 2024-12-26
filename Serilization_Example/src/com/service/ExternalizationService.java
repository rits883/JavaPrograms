package com.service;

import com.models.StudentDetails;

import java.io.*;

public class ExternalizationService {


    public  void  demoSerilaization () throws IOException {

        //Write file
        StudentDetails studentDetails = new StudentDetails("Jack","Chain",34,"jack@gmail.com");
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/files/student.sr");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        outputStream.writeObject(studentDetails);
        outputStream.close();
        fileOutputStream.close();
    }

    public  void  demoDeSerilaization () throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("src/com/files/student.sr");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       StudentDetails studentDetails = (StudentDetails) objectInputStream.readObject();
       objectInputStream.close();
       fileInputStream.close();
        System.out.println(studentDetails.toString());

    }
}
