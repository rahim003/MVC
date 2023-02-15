package peaksoft.servicies.impl;

import org.springframework.stereotype.Service;
import peaksoft.models.Hospital;
import peaksoft.repositories.HospitalRepo;
import peaksoft.servicies.HospitalService;

import java.util.List;

/**
 * @author krasa kurbanov
 * @created 15/02/2023 - 11:19
 **/
@Service
public class HospitalServiceImpl implements HospitalService {
    private final HospitalRepo hospitalRepo;


    public HospitalServiceImpl(HospitalRepo hospitalRepo) {
        this.hospitalRepo = hospitalRepo;
    }

    @Override
    public Hospital saveHospital(Hospital hospital) {
        hospitalRepo.saveHospital(hospital);
        return hospital;
    }

    @Override
    public List<Hospital> findAll() {
        return hospitalRepo.findAll();
    }
}
