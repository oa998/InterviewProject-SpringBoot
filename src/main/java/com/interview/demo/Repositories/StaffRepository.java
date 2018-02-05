package com.interview.demo.Repositories;

import com.interview.demo.Entities.StaffEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StaffRepository extends CrudRepository<StaffEntity, Long> {
    //add any custom, required signatures here

    //NativeQuery overcomes a compile-time error where '*' is an invalid character
    @Query(value = "Select * from STAFF where first_name=:fName", nativeQuery = true)
    public Iterable<StaffEntity> findByFirstName(@Param("fName") String firstName);
}