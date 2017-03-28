/**   
 *
 * @Title: SampleService.java 
 * @Package com.google.redskyf.msa.service 
 * @Description: 
 * @author redskyf redskyf@google.com   
 * @date 2017年3月28日 下午5:15:17 
 * @version V1.0.0 
 *  
 */
package com.google.redskyf.msa.service;

import org.springframework.stereotype.Service;

/** 
 * @ClassName: SampleService 
 * @Description: 
 * @author redskyf redskyf@google.com
 * @date 2017-03-28 17:15:17 
 *  
 */
@Service
public class SampleService {
    
    
    public String getServiceName(){
        return "SampleService";
    }
}
