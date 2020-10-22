package com.northland.service;


import com.northland.domain.Permission;
import com.northland.domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll(int page,int size) throws Exception;

    void save(Role role) throws Exception;

    void deleteRoleById(String roleId);

    Role findById(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);

    List<Permission> findOtherPermissions(String roleId);
}
