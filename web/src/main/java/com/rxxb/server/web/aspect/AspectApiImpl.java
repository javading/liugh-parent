package com.rxxb.server.web.aspect;

import com.rxxb.server.web.base.Constant;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * 基本被装饰类,做一些公共处理
 * Created by liugh on 2018/10/12.
 */
public class AspectApiImpl implements AspectApi {

    @Override
    public Object doHandlerAspect(ProceedingJoinPoint pjp, Method method) throws Throwable {
        Constant.isPass=false;
        return null;
    }
}
