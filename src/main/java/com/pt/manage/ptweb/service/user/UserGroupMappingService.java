package com.pt.manage.ptweb.service.user;

import com.pt.manage.ptweb.repository.user.UserGroupMappingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupMappingService {
    private final UserGroupMappingRepository userGroupMappingRepository;

    public UserGroupMappingService(UserGroupMappingRepository userGroupMappingRepository) {
        this.userGroupMappingRepository = userGroupMappingRepository;
    }

    public List<String> getAllUserGroupIds() {
        return userGroupMappingRepository.findDistinctUserGroupId();

    }
}
