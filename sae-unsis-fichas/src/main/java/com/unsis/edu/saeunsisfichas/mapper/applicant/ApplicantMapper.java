package com.unsis.edu.saeunsisfichas.mapper.applicant;

import com.unsis.edu.saeunsisfichas.dto.request.applicant.ApplicantRequest;
import com.unsis.edu.saeunsisfichas.dto.response.applicant.ApplicantResponse;
import com.unsis.edu.saeunsisfichas.mapper.BaseMapper;
import com.unsis.edu.saeunsisfichas.model.applicant.ApplicantModel;

import java.util.List;

public class ApplicantMapper implements BaseMapper<ApplicantResponse, ApplicantRequest, ApplicantModel> {
    @Override
    public ApplicantModel toEntity(ApplicantRequest dto) {
        return null;
    }

    @Override
    public ApplicantResponse toDto(ApplicantModel entity) {
        return null;
    }

    @Override
    public List<ApplicantResponse> toDtos(List<ApplicantModel> entities) {
        return List.of();
    }

    @Override
    public void updateEntity(ApplicantRequest request, ApplicantModel entity) {

    }
}
