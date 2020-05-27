package com.eeo.repository;

import com.eeo.entity.DayStudents;
import com.eeo.entity.NowStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DayStudenttRepository extends JpaRepository<DayStudents,Integer> {
}
