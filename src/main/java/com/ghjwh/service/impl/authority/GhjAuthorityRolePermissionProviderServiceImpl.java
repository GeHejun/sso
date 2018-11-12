package com.ghjwh.service.impl.authority;

import com.ghjwh.dao.mapper.authority.GhjAuthorityRolePermissionMapper;
import com.ghjwh.model.authority.GhjAuthorityRolePermission;
import com.ghjwh.service.authority.GhjAuthorityRolePermissionService;
import com.ghjwh.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by ghj on 2018/11/12.
 */
@Service
public class GhjAuthorityRolePermissionProviderServiceImpl extends AbstractService<GhjAuthorityRolePermission> implements GhjAuthorityRolePermissionService {

    @Autowired
    private GhjAuthorityRolePermissionMapper ghjAuthorityRolePermissionMapper;

}
