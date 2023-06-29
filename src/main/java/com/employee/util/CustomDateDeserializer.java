package com.employee.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;


public class CustomDateDeserializer extends JsonDeserializer<Date> {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String dateStr = jsonParser.getText();
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new IOException("Error parsing date: " + dateStr, e);
        }
    }
}
