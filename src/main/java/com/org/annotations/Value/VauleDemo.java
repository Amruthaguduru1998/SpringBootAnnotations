package com.org.annotations.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VauleDemo {

    @Value("Default Nmae")
   private String defaultName;

    @Value("${mail.host}")
    private String host;

    @Value("${mail.eamil}")
    private String email;

    @Value("${mail.password}")
    private String password;

    @Value("${java.home}")
    private String javaHome;

//    @Value("${HOME}")
//    private String homeDir;

    public String getJavaHome() {
        return javaHome;
    }

//    public String getHomeDir() {
//        return homeDir;
//    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDefaultName() {
        return defaultName;
    }
}
