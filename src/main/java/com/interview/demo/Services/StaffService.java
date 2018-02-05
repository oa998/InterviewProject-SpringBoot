package com.interview.demo.Services;

import com.interview.demo.Entities.StaffEntity;
import com.interview.demo.Repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepo;

    public List<StaffEntity> getAllStaff() {
        List<StaffEntity> staff = new ArrayList<>();
        staffRepo.findAll().forEach(staff::add);
        return staff;
    }

    public List<StaffEntity> getAllFords() {
        List<StaffEntity> fords = new ArrayList<>();
        staffRepo.findByFirstName("Ford").forEach(fords::add);
        return fords;
    }

    public StaffEntity getById(Long id){
        return staffRepo.findOne(id);
    }

}
