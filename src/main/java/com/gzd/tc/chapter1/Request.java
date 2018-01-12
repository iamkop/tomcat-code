package com.gzd.tc.chapter1;

import java.io.InputStream;

/**
 * @author gzd
 * @date 2018/1/12 17:10
 * @desc input the desc
 */
public class Request {
    private InputStream input;
    private String uri;

    public Request(InputStream input){
        this.input = input;
    }

    public void parseUri(String requestString){

    }

    public String getUri(){
        return uri;
    }
}
