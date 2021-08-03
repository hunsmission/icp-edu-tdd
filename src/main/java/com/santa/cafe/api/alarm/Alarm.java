package com.santa.cafe.api.alarm;

import java.util.Objects;

public class Alarm {
    private String api;
    private String requestBody;
    private Object errorMessage;

    public Alarm(String api, String requestBody, Object errorMessage) {
        this.api = api;
        this.requestBody = requestBody;
        this.errorMessage = errorMessage;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alarm alarm = (Alarm) o;
        return Objects.equals(api, alarm.api) &&
                Objects.equals(requestBody, alarm.requestBody) &&
                Objects.equals(errorMessage, alarm.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(api, requestBody, errorMessage);
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "api='" + api + '\'' +
                ", requestBody='" + requestBody + '\'' +
                ", errorMessage=" + errorMessage +
                '}';
    }
}
