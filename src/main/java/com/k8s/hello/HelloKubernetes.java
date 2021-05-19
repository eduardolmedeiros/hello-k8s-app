package com.k8s.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKubernetes {
    @RequestMapping("/")
    String home() {
        return "Hello World from Kubernetes!";
    }
}