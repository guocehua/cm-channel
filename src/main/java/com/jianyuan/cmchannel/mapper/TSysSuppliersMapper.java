package com.jianyuan.cmchannel.mapper;

import com.jianyuan.cmchannel.domain.TSysSuppliers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TSysSuppliersMapper {
    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TSysSuppliers record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TSysSuppliers record);
}