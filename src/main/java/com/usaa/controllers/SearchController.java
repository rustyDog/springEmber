package com.usaa.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by rustidog
 */
@RestController
public class SearchController {

    @RequestMapping(value="/findByMemberNumber", method=RequestMethod.GET)
    public String findByMemberNumber() {
        return "find by member number";
    }
}
