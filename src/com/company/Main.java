package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
//	    Developer dev1 = new Developer("mya","architect",170000);
//        Developer dev2 = new Developer("adam","python dev",90000);
//        Developer dev3 = new Developer("jodae","web dev",80000);
//
//        System.out.println(dev1);

        ObjectMapper map = new ObjectMapper();
//        String json = map.writeValueAsString(dev1);
//        System.out.println(json);
//        ArrayList<Developer> myDevList = new ArrayList<Developer>();
//        myDevList.add(dev1);
//        myDevList.add(dev2);
//        myDevList.add(dev3);
//        String jsonlistdata = map.writeValueAsString(myDevList);
//        System.out.println(jsonlistdata);
//
//        map.writeValue(new File("data.json"), myDevList);

        //////////////////////////////////////////////////////////////////

        ObjectMapper map2 = new ObjectMapper();
        String json2 = "[\n" +
                "    {\n" +
                "      \"body\": \"Walk the dog\",\n" +
                "      \"done\": false,\n" +
                "      \"id\": 0,\n" +
                "      \"priority\": 3,\n" +
                "      \"title\": \"dog\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"body\": \"Pay the bills\",\n" +
                "      \"done\": false,\n" +
                "      \"id\": 1,\n" +
                "      \"priority\": 1,\n" +
                "      \"title\": \"bills\"\n" +
                "    }\n" +
                "  ]";
        ArrayList<Task> myList2 = map.readValue(json2, ArrayList.class);
        System.out.println(myList2.get(0));

        //////////////////////////////////////////////////////////////////

//        System.out.println("Reader time!");
//        File file = new File("data.json");
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        String st;
//        String total = "";
//        while((st = br.readLine())!=null){
//            total = total+st;
//        }
//        System.out.println(total);
//        ArrayList<Developer>myList3 = map.readValue(total, ArrayList.class);
//        System.out.println("learning in values!");
//        System.out.println(myList3.get(1));
//    }
//}

//class Developer{
//    private String name;
//    private String title;
//    private int salary;
//
//
//    public Developer(String name, String title, int salary) {
//        this.name = name;
//        this.title = title;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Developer{" +
//                "name='" + name + '\'' +
//                ", title='" + title + '\'' +
//                ", salary=" + salary +
//                '}';
    }
}

class Task{

}