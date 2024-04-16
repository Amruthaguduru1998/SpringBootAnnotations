package com.org.annotations.propertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    //@Value("${gmail.host}")
    private String host;

    //@Value("${gmail.eamil}")
    private String email;

    //@Value("${gmail.password}")
    private String password;

    //@Value("${msg.name}")
    private String msgname;

    //@Value("${msg.type}")
    private String msgtype;

    @Autowired
    private Environment environment;
    public String getMsgname() {
        return environment.getProperty("msg.name");
    }

    public String getMsgtype() {
        return environment.getProperty("msg.type");
    }

    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getEmail() {
        return environment.getProperty("gmail.email");
    }

    public String getPassword() {
        return environment.getProperty("gmail.password");
    }
}
