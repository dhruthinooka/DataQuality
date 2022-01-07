package com.gap.hackathon.DataQuality.DQController;

import com.gap.hackathon.DataQuality.DQService.DataQualityService;
import com.gap.hackathon.DataQuality.Model.DataValidation1;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DataQualityController {

    @Autowired
    DataQualityService dataQualityService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/fetchErrorCount")
    public List<ErrorCountDetails> getErrorCount() {
        return dataQualityService.getErrorCount();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/fetchErrorData")
    public List<DataValidation1> fetchErrorData(@RequestParam String errorCode) {
        return dataQualityService.fetchErrorDataByErrorCode(errorCode);
//        System.out.println("Controller");
//        return "Response from fetchErrorData";
    }
}
