package com.deepexi.service.impl;

import com.deepexi.domain.DemoDo;
import com.deepexi.mapper.DemoMapper;
import com.deepexi.service.CrudDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudDemoServiceImpl implements CrudDemoService {
    @Autowired
    private DemoMapper mapper;

    @Override
    public List<DemoDo> listAll() {
        return mapper.selectAll();
    }
}
