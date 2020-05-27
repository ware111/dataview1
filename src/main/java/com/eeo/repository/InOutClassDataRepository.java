package com.eeo.repository;

import com.eeo.entity.ClassRoomData;
import com.eeo.entity.InOutClassData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InOutClassDataRepository extends JpaRepository<InOutClassData,Integer> {
}
