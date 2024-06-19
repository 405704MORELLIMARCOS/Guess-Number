package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.models.DummyModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {

    DummyModel getDummy(Long id);

    List<DummyModel> getDummyList();

    DummyModel createDummy(DummyModel dummy);
    DummyModel updateDummy(DummyModel dummy);
    void deleteDummy(DummyModel dummy);


}
