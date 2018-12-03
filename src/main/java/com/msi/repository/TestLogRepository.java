package com.msi.repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.msi.data.TestLog;

@Repository
public interface TestLogRepository extends ElasticsearchRepository<TestLog, String> {

}
