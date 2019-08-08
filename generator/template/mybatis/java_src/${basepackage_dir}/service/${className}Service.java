<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

import com.tgram.base.service.support.Service;
import ${basepackage}.model.${className};

public interface ${className}Service extends Service<${className}>{
}
