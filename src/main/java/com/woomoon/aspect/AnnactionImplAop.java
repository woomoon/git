package com.woomoon.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnactionImplAop {

//	public AnnactionImplAop () {
//		System.out.println("init--------------temp");
//	}

//	T_1.给这个类加一个 @Aspect 的注解，相当于在xml 中定义了一个切面，只是在这里这个类就是一个切面。
	
/*
T_2.定义一个pointcut[切点]
连接点于切点的概念：
连接点是数据库中各种各样的数据	【真正的连接点就是在dao层的各种方法】
切点是一条sql语句				【切点就是根据表达式找到连接点】【通知】
*/
	@Pointcut(value = "execution(* com.woomoon.controller.*.*(..))")
	private void beforPointcut() {//方法执行之前的切点
		
	}
//	T_3.声明一个通知
	@Before("beforPointcut()")
	private void adviceBofor() {
		System.out.println("aspectj aop--------------");
	}
	


}
