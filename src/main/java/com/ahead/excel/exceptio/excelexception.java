package com.ahead.excel.exceptio;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/20 15:57
 */
@RestControllerAdvice
public class excelexception {

       @ExceptionHandler(value = Exception.class)
      public String defualtErroHandler(HttpServletRequest req,Exception e)throws Exception{
                e.getMessage();
                return "出现了"+e.getMessage();
       }
}
