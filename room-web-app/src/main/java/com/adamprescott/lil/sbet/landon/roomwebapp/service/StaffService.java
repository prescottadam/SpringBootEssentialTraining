package com.adamprescott.lil.sbet.landon.roomwebapp.service;

import com.adamprescott.lil.sbet.landon.roomwebapp.data.StaffRepository;
import com.adamprescott.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff() {
        return staffRepository.findAll();
    }
}
