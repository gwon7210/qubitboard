package com.simplify.sample.db.service;

import com.simplify.sample.db.dto.Test;
import com.simplify.sample.db.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public List<Test> getAll() throws Exception{
        return testMapper.getAll();
    }



}
