package com.jyujyu.review.api;

import com.jyujyu.review.model.TestEntity;
import com.jyujyu.review.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestQueryApi {
    private final TestService testService;

    public TestQueryApi(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa() {
        return testService.findAllByNameByJPA("lee");
    }

    @GetMapping("/test/query/querydsl")
    public List<TestEntity> queryQuerydsl(){
        return testService.findAllByNameByQuerydsl("lee");
    }
}
