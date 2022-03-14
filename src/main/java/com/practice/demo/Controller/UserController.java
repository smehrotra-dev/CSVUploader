package com.practice.demo.Controller;

import com.practice.demo.POJO.User;
import com.practice.demo.util.CSVParser;
import com.practice.demo.util.ServiceConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@Slf4j
@EnableSwagger2
@RequestMapping(ServiceConstants.ADD_USER_API)
public class UserController {


    @PostMapping("/addUsers")
    public void addUsers(){
        List<User> users= CSVParser.parseCsv();
    }
}
