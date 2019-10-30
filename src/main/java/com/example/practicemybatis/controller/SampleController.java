package com.example.practicemybatis.controller;

import com.example.practicemybatis.mapper.SampleMapper;
import com.example.practicemybatis.model.SampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SampleController {

    private final SampleMapper sampleMapper;

    @Autowired
    public SampleController(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    @GetMapping
    public String getUser(Model model) {
        SampleModel sampleModel = sampleMapper.selectUser(1);
        System.out.println(sampleModel.getId());
        System.out.println(sampleModel.getUserName());
        return "hello";
    }
}
