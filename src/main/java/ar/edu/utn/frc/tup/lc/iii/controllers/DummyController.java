package ar.edu.utn.frc.tup.lc.iii.controllers;

import ar.edu.utn.frc.tup.lc.iii.dtos.DummyDto;
import ar.edu.utn.frc.tup.lc.iii.models.DummyModel;
import ar.edu.utn.frc.tup.lc.iii.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @Autowired
    private DummyService dummyService;

    @GetMapping("")
    public ResponseEntity <DummyDto> getDummyList(){
        List<DummyModel> dummyList = dummyService.getDummyList();
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity <DummyDto> getDummyById(@PathVariable Long id){
        DummyModel dummy = dummyService.getDummy(id);

        return null;
    }

    @PostMapping("")
    public ResponseEntity <DummyDto> createDummy(DummyDto dummyDto){
        DummyModel dummy = dummyService.createDummy(null);
        return null;
    }
    @PutMapping("")
    public ResponseEntity <DummyDto> updateDummy(DummyDto dummyDto){
        DummyModel dummy = dummyService.updateDummy(null);
        return null;
    }

    @DeleteMapping("")
    public ResponseEntity <DummyDto> deleteDummy(DummyDto dummyDto){
        dummyService.deleteDummy(null);
        return null;
    }
}
