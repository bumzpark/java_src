package com.springBatchTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import com.springBatchTest.mapper.TestDataMapper;

@Service
public class TestDataService {
    @Autowired
    TestDataMapper testData ; 

    public List<Map<String, Object>> getTestDataList() {
        return testData.getTestDataList(); 
    } 

    public List<Map<String, Object>> getAmUsersChangeList() {
        return testData.getAmUsersChangeList(); 
    }
}