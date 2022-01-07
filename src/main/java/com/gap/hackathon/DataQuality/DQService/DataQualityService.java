package com.gap.hackathon.DataQuality.DQService;

import com.gap.hackathon.DataQuality.Model.DataValidation;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;
import com.gap.hackathon.DataQuality.Repository.DataQualityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataQualityService {

    @Autowired
    DataQualityRepository dataQualityRepository;

    public List<ErrorCountDetails> getErrorCount() {
        return dataQualityRepository.findCountForAllErrorCodes();
    }

    public List<DataValidation> fetchErrorDataByErrorCode(String errorCode) {
        return dataQualityRepository.fetchDataByErrorCode(errorCode);
    }
}
