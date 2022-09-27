package com.tribble.tribblefast.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 自定义时间日期工具类
 *
 * @author lifan
 * @since 2022/8/25 7:56 PM
 */
public class DateTimeUtils {
    /** 默认日期时间格式 2022-08-25 07:07:07 */
    private static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /** 系统默认时区*/
    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();

    /** UTC+8 中国标准时间时区(China Standard Time) */
    private static final ZoneId CST_ZONE = ZoneId.of("Asia/Shanghai");

    /** UTC+0 世界协调时时区(Coordinated Universal Time) */
    private static final  ZoneId UTC_ZONE = ZoneId.of("UTC");

    /**
     * 使用默认日期时间格式的格式化器, 如:2022-08-25 07:07:07
     * @see DateTimeUtils#DEFAULT_DATETIME_PATTERN
     * */
    private static final DateTimeFormatter DEFAULT_DF = DateTimeFormatter.ofPattern(DEFAULT_DATETIME_PATTERN);

    public static String format(LocalDateTime localDateTime) {
        return  DEFAULT_DF.format(localDateTime);
    }


}
