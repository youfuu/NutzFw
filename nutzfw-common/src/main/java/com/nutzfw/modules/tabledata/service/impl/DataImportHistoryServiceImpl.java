/*
 * Copyright (c) 2019- 2019 threefish(https://gitee.com/threefish https://github.com/threefish) All Rights Reserved.
 * 本项目完全开源，商用完全免费。但请勿侵犯作者合法权益，如申请软著等。
 * 最后修改时间：2019/10/07 18:27:07
 * 源 码 地 址：https://gitee.com/threefish/NutzFw
 */

package com.nutzfw.modules.tabledata.service.impl;

import com.nutzfw.core.common.service.impl.BaseServiceImpl;
import com.nutzfw.modules.tabledata.entity.DataImportHistory;
import com.nutzfw.modules.tabledata.service.DataImportHistoryService;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * @author 黄川 huchuc@vip.qq.com
 * @date 2018年06月19日 12时11分39秒
 */
@IocBean(name = "dataImportHistoryService", args = {"refer:dao"})
public class DataImportHistoryServiceImpl extends BaseServiceImpl<DataImportHistory> implements DataImportHistoryService {
    public DataImportHistoryServiceImpl(Dao dao) {
        super(dao);
    }
}
