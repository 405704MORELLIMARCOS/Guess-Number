package ar.edu.utn.frc.tup.lc.iii.services.impl;

import ar.edu.utn.frc.tup.lc.iii.models.DummyModel;
import ar.edu.utn.frc.tup.lc.iii.repositories.DummyRepository;
import ar.edu.utn.frc.tup.lc.iii.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImpl implements DummyService {

    @Autowired
    DummyRepository dummyRepository;
    @Override
    public DummyModel getDummy(Long id) {
        return null;
    }

    @Override
    public List<DummyModel> getDummyList() {
        return null;
    }

    @Override
    public DummyModel createDummy(DummyModel dummy) {
        return null;
    }

    @Override
    public DummyModel updateDummy(DummyModel dummy) {
        return null;
    }

    @Override
    public void deleteDummy(DummyModel dummy) {

    }
}
