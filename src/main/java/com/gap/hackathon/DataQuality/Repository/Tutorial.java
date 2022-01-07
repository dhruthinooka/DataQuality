package com.gap.hackathon.DataQuality.Repository;


import com.gap.hackathon.DataQuality.Model.DataValidation1;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;

import java.util.List;

public interface Tutorial {

    public List<ErrorCountDetails> findAll();

    public List<DataValidation1> findByErrorCode(String errorCode);
}