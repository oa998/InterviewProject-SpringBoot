package com.interview.demo.Controllers;

import com.interview.demo.Entities.StaffEntity;
import com.interview.demo.Services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class StaffController {

    @Autowired
    StaffService staffService;

    @RequestMapping(value="/ford", method= RequestMethod.GET)
    List<StaffEntity> getFords(){
        return staffService.getAllFords();
    }

    @RequestMapping(value="/staff/{id}", method = RequestMethod.GET)
    StaffEntity getById(@PathVariable("id")Long id) throws Exception{
        StaffEntity staff = staffService.getById(id);
        if(staff == null){
            throw new Exception(""+id);
        }else{
            return staff;
        }
    }

}
