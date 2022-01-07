package com.gap.hackathon.DataQuality.DQController;

import com.gap.hackathon.DataQuality.DQService.DataQualityService;
import com.gap.hackathon.DataQuality.Model.DataValidation;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataQualityController {

    @Autowired
    DataQualityService dataQualityService;

    @GetMapping("/fetchErrorCount")
    public List<ErrorCountDetails> getErrorCount() {
        return dataQualityService.getErrorCount();
    }

    @GetMapping("/fetchErrorData")
    public List<DataValidation> fetchErrorData(@RequestParam String errorCode) {
        return dataQualityService.fetchErrorDataByErrorCode(errorCode);
    }
}
