/**
 * Copyright (c) 2016-2019 通用开源 All rights reserved.
 *
 * https://www.marvinmao.io
 *
 * 版权所有，侵权必究！
 */

package io.marvinmao.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.marvinmao.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
