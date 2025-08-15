package com.unsis.edu.saeunsisfichas.repository.applicant;

import com.unsis.edu.saeunsisfichas.model.applicant.ApplicantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApplicantRepository extends JpaRepository<ApplicantModel, String> { }
