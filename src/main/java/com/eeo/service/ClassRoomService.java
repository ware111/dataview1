package com.eeo.service;


public interface ClassRoomService{

    //24小时内在线的教室
    int[] find24ClassRoom();

    //30天在线的教室
    int[] find30ClassRoom();
}
