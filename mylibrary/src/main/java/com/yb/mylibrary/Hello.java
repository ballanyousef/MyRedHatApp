package com.yb.mylibrary;

public class Hello {
    private String message;
    private String target;

    public Hello(String message, String target) {
        this.message = message;
        this.target = target;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "message='" + message + '\'' +
                ", target='" + target + '\'' +
                '}';
    }
}
