package com.ll.vhr.service;

import com.ll.vhr.mapper.MenuMapper;
import com.ll.vhr.model.Hr;
import com.ll.vhr.model.Menu;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by a handsome man
 *
 * @Author: mental_test
 * @Date: 2023/02/13/21:59
 * @Description:
 */
@Service
public class MenuService {

    @Resource
    MenuMapper menuMapper;

    public List<Menu> getMenuByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
