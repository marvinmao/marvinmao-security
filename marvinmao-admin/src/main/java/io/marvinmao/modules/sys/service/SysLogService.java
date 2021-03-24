/**
 * Copyright (c) 2016-2019 通用开源 All rights reserved.
 *
 * https://www.marvinmao.io
 *
 * 版权所有，侵权必究！
 */

package io.marvinmao.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.marvinmao.common.utils.PageUtils;
import io.marvinmao.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
