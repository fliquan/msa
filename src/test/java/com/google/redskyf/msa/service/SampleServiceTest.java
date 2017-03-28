/**   
 *
 * @Title: SampleServiceTest.java 
 * @Package com.google.redskyf.msa.service 
 * @Description: 
 * @author redskyf redskyf@google.com   
 * @date 2017年3月28日 下午5:21:43 
 * @version V1.0.0 
 *  
 */
package com.google.redskyf.msa.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * @ClassName: SampleServiceTest 
 * @Description: 
 * @author redskyf redskyf@google.com
 * @date 2017-03-28 17:21:43 
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SampleServiceTest {
    
    @Autowired
    private SampleService sampleService;
    
    @Test
    public void testGetServiceName(){
        Assert.assertEquals("SampleService", sampleService.getServiceName());
    }
}
