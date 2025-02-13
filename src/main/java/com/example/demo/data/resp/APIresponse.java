package com.example.demo.data.resp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIresponse {
    private int status;
    private boolean success;
    private String message;
    private Object data;
    private String service;
}
