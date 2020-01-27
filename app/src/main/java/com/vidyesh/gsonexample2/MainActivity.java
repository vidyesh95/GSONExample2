package com.vidyesh.gsonexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Gson gson = new Gson();*/
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        Employee employee = new Employee("John",
                30, "john@gmail.com", "secretPassWord");

        // On debug click on [Step into(F7)], [Step out(F8)] and [Step into(F7)]
        String jsonResult = gson.toJson(employee);

        String json = "{\"age\":30,\"firstName\":\"John\",\"mail\":\"john@gmail.com\",\"password\":\"secretPassWord\"}";

        // On debug click on [Step into(F7)], [Step out(F8)] and [Step into(F7)]
        Employee employee1 = gson.fromJson(json, Employee.class);
    }
}
