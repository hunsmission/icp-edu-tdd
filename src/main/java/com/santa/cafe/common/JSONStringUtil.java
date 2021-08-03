package com.santa.cafe.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONStringUtil {
    private static final Logger LOG = LoggerFactory.getLogger(JSONStringUtil.class);

    public static String toJSON(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "";
        try {
            jsonString = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            LOG.error("parse JSON string with requestBody is failed.");
        }
        return jsonString;
    }
}
