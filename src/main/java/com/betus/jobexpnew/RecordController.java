package com.betus.jobexpnew;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/record")
class RecordController {
    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping
    public Record createRecord() {
        return recordService.createRandomRecord();
    }


}