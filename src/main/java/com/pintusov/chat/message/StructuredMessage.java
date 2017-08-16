package com.pintusov.chat.message;

import java.util.ArrayList;
import java.util.List;

public abstract class StructuredMessage extends ChatMessage {
    protected List<String> dataList = new ArrayList<>();

    protected StructuredMessage(String type) {
        super(type);
    }

    protected StructuredMessage(String type, List dataList) {
        super(type);
        this.dataList = dataList;
    }

    public List getList() {
        return dataList;
    }

}
