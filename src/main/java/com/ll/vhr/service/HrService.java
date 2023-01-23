package com.ll.vhr.service;

import com.ll.vhr.mapper.HrMapper;
import com.ll.vhr.mapper.HrRoleMapper;
import com.ll.vhr.mapper.RoleMapper;
import com.ll.vhr.model.Hr;
import com.ll.vhr.model.HrRole;
import com.ll.vhr.model.Role;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author mentaltest
 * 时间： 2023/1/23
 */
@Service
public class HrService implements UserDetailsService {

    @Resource
    HrMapper hrMapper;

    @Resource
    HrRoleMapper hrRoleMapper;

    @Resource
    RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(s);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }


        return hr;
    }
}
