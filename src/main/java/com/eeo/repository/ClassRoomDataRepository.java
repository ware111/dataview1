package com.eeo.repository;

import com.eeo.entity.ClassRoomData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClassRoomDataRepository  extends JpaRepository<ClassRoomData,Integer> {
}
