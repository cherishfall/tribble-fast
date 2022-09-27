package com.tribble.tribblefast.controller;

import com.alibaba.cola.dto.SingleResponse;
import com.tribble.tribblefast.util.DateTimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author lifan
 * @since 2022/9/27 9:30 AM
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello_world")
    SingleResponse<String> helloWorld() {
        String helloStr = "Hello World!\n" + DateTimeUtils.format(LocalDateTime.now());
        return SingleResponse.of(helloStr);
    }


}
