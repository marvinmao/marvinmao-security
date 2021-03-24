/**
 * Copyright (c) 2016-2019 通用开源 All rights reserved.
 *
 * https://www.marvinmao.io
 *
 * 版权所有，侵权必究！
 */

package io.marvinmao.common.validator;

import io.marvinmao.common.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author Mark sunlightcs@gmail.com
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
