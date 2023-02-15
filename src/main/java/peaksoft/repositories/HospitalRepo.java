package peaksoft.repositories;

import org.springframework.stereotype.Repository;
import peaksoft.models.Hospital;

import java.util.List;

/**
 * @author krasa kurbanov
 * @created 15/02/2023 - 11:16
 **/
@Repository
public interface HospitalRepo {
    void saveHospital(Hospital hospital);
    List<Hospital>findAll();

}
