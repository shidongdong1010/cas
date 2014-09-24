package org.dd.sso.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextUtil implements ApplicationContextAware {  
    private static ApplicationContext context;  
    /** 
     * 此方法可以把ApplicationContext对象inject到当前类中作为一个静态成员变量。 
     * @param applicationContext ApplicationContext 对象. 
     * @throws BeansException 
     */  
    @Override  
    public void setApplicationContext( ApplicationContext applicationContext ) throws BeansException {  
    	context = applicationContext;  
    }  
    /** 
     * 这是一个便利的方法，帮助我们快速得到一个BEAN 
     * @param beanName bean的名字 
     * @return 返回一个bean对象 
     */  
    public static Object getBean( String beanName ) {  
        return context.getBean( beanName );  
    }
    
    public static <T> T getBean(Class<T> t){
    	return context.getBean(t);
    }
}  
