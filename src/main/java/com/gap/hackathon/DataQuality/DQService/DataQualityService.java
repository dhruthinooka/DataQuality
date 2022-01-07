package com.gap.hackathon.DataQuality.DQService;

import com.gap.hackathon.DataQuality.Model.DataValidation;
import com.gap.hackathon.DataQuality.Model.DataValidation1;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;
//import com.gap.hackathon.DataQuality.Repository.DataQualityRepository;
import com.gap.hackathon.DataQuality.Repository.DataValidationRepository;
import com.gap.hackathon.DataQuality.Repository.Tutorial;
import com.gap.hackathon.DataQuality.Repository.TutorialImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataQualityService {

//    @Autowired
//    DataQualityRepository dataQualityRepository;

    @Autowired
    DataValidationRepository dataValidationRepository;

    @Autowired
    TutorialImpl tutorial;

    public List<ErrorCountDetails> getErrorCount() {
        return tutorial.findAll();
    }

    public List<DataValidation1> fetchErrorDataByErrorCode(String errorCode) {
        return tutorial.findByErrorCode(errorCode);
    }
}
