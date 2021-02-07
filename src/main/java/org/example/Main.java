package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.entity.Person;
import org.example.utils.JsonReader;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	String jsonFileName = args[1].substring(0, args[1].lastIndexOf("."));
        JsonReader reader = new JsonReader();
        Person person = reader.readPerson(args[1]);

        System.out.println("Read \"person\" from JSON file: " + person);
        System.out.println("Write \"person\" to XML file.");

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File(jsonFileName+".xml"),person);



    }

}
