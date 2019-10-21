package com.jianyuan.cmchannel.service;

import com.jianyuan.cmchannel.domain.TSysSuppliers;
import com.jianyuan.cmchannel.exception.ChannelException;
import com.jianyuan.cmchannel.mapper.TSysSuppliersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author cb
 */

@Service
@Transactional(rollbackFor = ChannelException.class)
public class RegAccountService {

    @Autowired
    private TSysSuppliersMapper suppliersMapper;

    public Map<String, Object> addAccount(TSysSuppliers suppliers) {

        Map<String, Object> map = new HashMap<String, Object>();
        if (suppliers.getSupId()==null &&!"".equals(suppliers.getSupId())){
            //具体规则不清楚,先这样写,后续修改
            String suId = UUID.randomUUID().toString().replaceAll("-","").substring(0,4);
            suppliers.setSupId(suId);
            int row = suppliersMapper.insert(suppliers);
            map.put("row",row);
            return map;

        }else{
            map.put("message","保存失败");
            return map;
        }

    }
}
