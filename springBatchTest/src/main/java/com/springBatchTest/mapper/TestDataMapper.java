package com.springBatchTest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDataMapper {
	List<Map<String, Object>> getTestDataList();
	List<Map<String, Object>> getAmUsersChangeList();
}
