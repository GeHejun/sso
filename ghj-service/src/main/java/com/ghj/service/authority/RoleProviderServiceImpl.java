package com.ghj.service.authority;

import com.alibaba.dubbo.config.annotation.Service;
import com.ghj.common.dto.RoleDTO;
import com.ghj.common.dto.UserDTO;
import com.ghj.service.AbstractProviderService;
import com.ghj.entity.authority.Role;
import com.ghj.dao.authority.RoleMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by ghj on 2018/11/14.
 */
@Service
public class RoleProviderServiceImpl extends AbstractProviderService<RoleDTO,Role> implements RoleService<RoleDTO,Role>{

    @Autowired
    private RoleMapper roleMapper;




}
