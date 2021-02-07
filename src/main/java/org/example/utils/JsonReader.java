package org.example.utils;

import org.codehaus.jackson.map.ObjectMapper;
import org.example.entity.Person;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    public Person readPerson(String url) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        final Person person = mapper.readValue(new File(url), Person.class);
        return person;
    }
}
