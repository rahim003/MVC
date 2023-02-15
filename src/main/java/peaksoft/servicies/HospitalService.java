package peaksoft.servicies;

import org.springframework.stereotype.Service;
import peaksoft.models.Hospital;

import java.util.List;

/**
 * @author krasa kurbanov
 * @created 15/02/2023 - 11:19
 **/
@Service
public interface HospitalService {
    Hospital saveHospital(Hospital hospital);

    List<Hospital> findAll();
}
