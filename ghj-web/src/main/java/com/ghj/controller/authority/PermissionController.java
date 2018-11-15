package com.ghj.controller.authority;

import com.ghj.service.authority.PermissionConsumerServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * Created by ghj on 2018/11/14.
 */
@Controller
@RequestMapping("/ghjAuthorityPermission/")
public class PermissionController {

    @Autowired
    PermissionConsumerServiceImpl permissionConsumerService;

    @RequestMapping("add")
    @ResponseBody
    public String add(Permission ghjAuthorityPermission) {
        permissionConsumerService.save(ghjAuthorityPermission);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
        permissionConsumerService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(Permission ghjAuthorityPermission) {
        permissionConsumerService.update(ghjAuthorityPermission);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        Permission ghjAuthorityPermission = permissionConsumerService.findById(id);
        return ghjAuthorityPermission.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Permission> list = permissionConsumerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}