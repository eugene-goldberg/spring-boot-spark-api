package com.dfs.harmony.springbootsparkapi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

    @GetMapping(value = "/all")
    public List<String> searchAll() {
            List<String> valueList = new ArrayList<String>();
        return valueList;
    }


}
