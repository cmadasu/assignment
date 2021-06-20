package com.abc.account.DateFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormatter extends StdSerializer<Date> {

        private SimpleDateFormat formatter
                = new SimpleDateFormat("MMMM, dd yyyy");

        public CustomDateFormatter() {
            this(null);
        }

        public CustomDateFormatter(Class t) {
            super(t);
        }

        @Override
        public void serialize (Date value, JsonGenerator gen, SerializerProvider arg2)
                throws IOException, JsonProcessingException {
            gen.writeString(formatter.format(value));
        }
    }

