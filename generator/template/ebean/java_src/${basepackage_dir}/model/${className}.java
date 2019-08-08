<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;

import javax.persistence.*;

import io.ebean.ext.Finder;

<#include "/java_imports.include">

public class ${className}Entity extends BaseModel {
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
