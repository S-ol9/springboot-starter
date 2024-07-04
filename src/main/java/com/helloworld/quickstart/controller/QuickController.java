package com.helloworld.quickstart.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class QuickController {
    @GetMapping("/dummy")
    public String dummy() {
        log.info("dummy");
        return "dummy";
    }

    @GetMapping("/dummy2")
    public String dummy2() {
        log.info("dummy");
        return "dummy2";
    }

    @GetMapping("/member")
    public String getMember(@RequestParam("empNo") String empNo
            , @RequestParam("year") int year) {
        log.info("empNo: {}", empNo);
        log.info("yearL {}", year);
        return "ok";
    }

    @GetMapping("company/{id}")
    public String getCompany(@PathVariable("id") String id) {
        log.info("id: {} ", id);
        return "ok";
    }

}
