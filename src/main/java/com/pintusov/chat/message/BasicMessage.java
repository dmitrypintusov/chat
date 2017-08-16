package com.pintusov.chat.message;

public abstract class BasicMessage extends ChatMessage {
    protected String dataString;

    BasicMessage(String type, String dataString) {
        super(type);
        this.dataString = dataString;
    }

    public String getData() {
        return this.dataString;
    }
    
}
