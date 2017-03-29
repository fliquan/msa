/**   
 *
 * @Title: BaseVO.java 
 * @Package com.google.redskyf.framework.vo 
 * @Description: 
 * @author redskyf redskyf@google.com   
 * @date 2017年3月29日 下午5:14:49 
 * @version V1.0.0 
 *  
 */
package com.google.redskyf.framework.vo;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: BaseVO 
 * @Description: 
 * @author redskyf redskyf@google.com
 * @date 2017-03-29 17:14:49 
 *  
 */
public class BaseVO implements Serializable{

    /** 
     * @Fields serialVersionUID : 
     */ 
    private static final long serialVersionUID = 1L;
    
    private String creatorId;
    private Date dateCreated;
    private String modifierId;
    private Date dateModified;
    public String getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public String getModifierId() {
        return modifierId;
    }
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }
    public Date getDateModified() {
        return dateModified;
    }
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    
    
}
