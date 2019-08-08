<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

<#include "/java_imports.include">

import com.tgram.base.dao.DaoHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tgram.base.service.impl.ServiceImpl;
import ${basepackage}.model.${className};
import ${basepackage}.service.${className}Service;

@Service("${classNameLower}Service")
public class ${className}ServiceImpl extends ServiceImpl<${className}> implements ${className}Service {
	  @Resource(name = "daoHelper")
    protected void setDaoHelper(DaoHelper daoHelper) {
        super.setDaoHelper(daoHelper);
    }
}
