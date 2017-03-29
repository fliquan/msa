/**   
 *
 * @Title: SampleMapper.java 
 * @Package com.google.redskyf.msa.mapper 
 * @Description: 
 * @author redskyf redskyf@google.com   
 * @date 2017年3月29日 下午4:55:14 
 * @version V1.0.0 
 *  
 */
package com.google.redskyf.msa.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.google.redskyf.msa.vo.SampleVO;

/** 
 * @ClassName: SampleMapper 
 * @Description: 
 * @author redskyf redskyf@google.com
 * @date 2017-03-29 16:55:14 
 *  
 */
@MapperScan
public interface SampleMapper {
    
    List<SampleVO> query();
    
}
