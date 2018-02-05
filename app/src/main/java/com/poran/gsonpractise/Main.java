package com.poran.gsonpractise;

import com.google.gson.Gson;

/**
 * Created by poran on 06-Feb-18.
 */

public class Main {

    public static void main(String[]args){
       serialization();
        deserialization();

    }

    public static void serialization(){
        Student student=new Student(
                "poran",
                "161-15-7020",
                "Dept. of CSE",
                "poran.cse@gmail.com",
                3.50,
                false
        );

        Gson gson=new Gson();
        String jsonData=gson.toJson(student);



    }

    public static void deserialization(){

        String jsonData="{\"studentName\":\"poran\",\"studentId\":\"161-15-7020\",\"department\":\"Dept. of CSE\",\"studentMail\":\"poran.cse@gmail.com\",\"studentCgpa\":3.5,\"isRetake\":false}";
        Gson gson=new Gson();
        Student student=gson.fromJson(jsonData,Student.class);


    }


}
