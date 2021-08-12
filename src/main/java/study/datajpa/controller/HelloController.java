package study.datajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project : data-jpa
 * Created by gonuu
 * Date : 2021-08-06
 * Time : 오전 10:30
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
