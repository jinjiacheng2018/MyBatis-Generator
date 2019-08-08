<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage};

import com.tgram.base.entity.support.Entity;
import com.tgram.base.entity.support.NameSpace;

import java.io.Serializable;

<#include "/java_imports.include">

@NameSpace("${className}")
public class ${className} extends Entity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	<#list table.columns as column>
	private ${column.javaType} ${column.columnNameLower};  <#if column.remarks??>//${column.remarks}</#if>
	</#list>

<@generateConstructor className/>
<@generateJavaColumns/>
<#macro generateJavaColumns>
	<#list table.columns as column>
	public void set${column.columnName}(${column.javaType} ${column.columnNameLower}) {
		this.${column.columnNameLower} = ${column.columnNameLower};
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>
}
