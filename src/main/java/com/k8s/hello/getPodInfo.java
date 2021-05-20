package com.k8s.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class getPodInfo {
    @RequestMapping("/pod")
    String home() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        return
          "pod: "+ inetAddress.getHostName() +" ip address: "+ inetAddress.getHostAddress() +"";
    }
    
}