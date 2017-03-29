/**   
 *
 * @Title: Main.java 
 * @Package com.google.redskyf 
 * @Description: 
 * @author redskyf redskyf@google.com   
 * @date 2017年3月28日 下午4:43:06 
 * @version V1.0.0 
 *  
 */
package com.google.redskyf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.redskyf.msa.service.SampleService;

/** 
 * @ClassName: Main 
 * @Description: 
 * @author redskyf redskyf@google.com
 * @date 2017-03-28 16:43:06 
 *  
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    
    /** 
     * @Title: main 
     * @Description: 
     * @param args
     */
    public static void main(String[] args) {
        LOGGER.info("System Starting...........");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SampleService ss = (SampleService)context.getBean("sampleService");
        System.out.println(ss.query().size());
        LOGGER.info("System over...........");
    }

}
