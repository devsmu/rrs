package com.jyujyu.review.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLombokApi {

    @GetMapping("/test/lombok")
    public TestLombokResponseBody testLombok(){
        return new TestLombokResponseBody("lee",20);
    }

    @Getter
    public static class TestLombokResponseBody {
        String name;
        Integer age;

        public TestLombokResponseBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
