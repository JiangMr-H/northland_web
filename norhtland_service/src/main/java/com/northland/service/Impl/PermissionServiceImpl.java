package com.northland.service.Impl;

import com.github.pagehelper.PageHelper;
import com.northland.dao.IPermissionDao;
import com.northland.domain.Permission;
import com.northland.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findAll(int page,int size) throws Exception{
        PageHelper.startPage(page,size);
        return permissionDao.findAll();
    }
}
