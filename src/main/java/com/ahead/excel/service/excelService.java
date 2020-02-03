package com.ahead.excel.service;

import com.ahead.excel.pojo.user;
import java.util.Set;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/24 16:22
 */
public interface excelService {
    int getSize();
    Set<user> result(String msg);
}
