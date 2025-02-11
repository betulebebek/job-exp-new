package com.betus.jobexpnew;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
class RecordController {
    private final RecordService recordService;
    private final RecordRepository recordRepository;

    public RecordController(RecordService recordService, RecordRepository recordRepository) {
        this.recordService = recordService;
        this.recordRepository = recordRepository;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Record createRecord() throws RecordCreationException {
        return recordService.createRandomRecord();
    }

    @GetMapping
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

}