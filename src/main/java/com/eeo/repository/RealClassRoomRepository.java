package com.eeo.repository;

import com.eeo.entity.RealTimeClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * 实时24小时/30天在线教室数jpa
 *
 * */

@Repository
public interface RealClassRoomRepository extends JpaRepository<RealTimeClassRoom, Long> {
}
