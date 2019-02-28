package com.stackroute;

import org.apache.commons.lang3.StringUtils;

public class MavenDemo {

    public String greetUser(){
        return "Hello Maven";
    }
    public String greetUserWithStringUtils(){
        return (StringUtils.capitalize("hello maven"));
    }
}
