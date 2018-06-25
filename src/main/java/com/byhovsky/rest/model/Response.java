package com.byhovsky.rest.model;

public class Response {

    private boolean status;
    private String message;

    public boolean isStatus() {
        return status;
    }

    /**
     * Setter for property 'status'.
     *
     * @param status Value to set for property 'status'.
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Getter for property 'message'.
     *
     * @return Value for property 'message'.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter for property 'message'.
     *
     * @param message Value to set for property 'message'.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
