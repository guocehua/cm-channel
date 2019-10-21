package com.jianyuan.cmchannel.admittanceController;

import com.jianyuan.cmchannel.domain.TSysSuppliers;
import com.jianyuan.cmchannel.service.RegAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 入网账号开通接口
 * @author cb
 */
@RestController
@RequestMapping("register")
@Slf4j
public class RegAccountController {

    @Autowired
    private RegAccountService regAccountService;
    @RequestMapping("addAccount")
    @ResponseBody
    public Map<String,Object> addAccount(TSysSuppliers suppliers){

        return regAccountService.addAccount(suppliers);
    }
}
