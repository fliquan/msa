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

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.google.redskyf.framework.service.BaseService;
import com.google.redskyf.msa.mapper.SampleMapper;
import com.google.redskyf.msa.vo.SampleVO;

/** 
 * @ClassName: SampleService 
 * @Description: 
 * @author redskyf redskyf@google.com
 * @date 2017-03-28 17:15:17 
 *  
 */
@Service
public class SampleService extends BaseService {
    
    @Resource
    private SampleMapper sampleMapper;
    
    public List<SampleVO> query(){
        return sampleMapper.query();
    }
    
    public String getServiceName(){
        return "SampleService";
    }
}
