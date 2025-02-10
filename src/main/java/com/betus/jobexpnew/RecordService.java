package com.betus.jobexpnew;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Slf4j
@Service
public class RecordService {
    private final RecordRepository recordRepository;
    private final List<String> names = Arrays.asList(
            "Betül Topal", "Berke Maktav", "İlke Yeniaydın", "Oğuz Özdemir",
            "Can Bllb", "Büşra Karakuş", "Zehra Akan", "Kaan Körfez"
    );

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Scheduled(cron = "0 */2 * * * ?")
    public void saveRandomRecord() {
        try {
            Record record = createRandomRecord();
            recordRepository.saveAndFlush(record);
            log.info("Saved record: {}", record);
        } catch (Exception e) {
            log.error("Error occurred while saving record: ", e);
        }
    }



    public Record createRandomRecord() {
        Random random = new Random();
        String randomName = names.get(random.nextInt(names.size()));

        Record record = new Record();
        record.setName(randomName);
        record.setCreatedAtTimestamp(new Timestamp(System.currentTimeMillis()));
        record.setCreatedAt(new java.sql.Date(System.currentTimeMillis()));

        return record;
    }

}