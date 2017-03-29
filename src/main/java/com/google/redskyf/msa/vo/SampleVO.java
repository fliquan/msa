/**   
 *
 * @Title: SampleVO.java 
 * @Package com.google.redskyf.msa.vo 
 * @Description: 
 * @author redskyf redskyf@google.com   
 * @date 2017年3月29日 下午5:14:05 
 * @version V1.0.0 
 *  
 */
package com.google.redskyf.msa.vo;

import com.google.redskyf.framework.vo.BaseVO;

/** 
 * @ClassName: SampleVO 
 * @Description: 
 * @author redskyf redskyf@google.com
 * @date 2017-03-29 17:14:05 
 *  
 */
public class SampleVO extends BaseVO{

    /** 
     * @Fields serialVersionUID : 
     */ 
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    private String description;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
