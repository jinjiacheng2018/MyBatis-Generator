<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;

import javax.persistence.*;

import io.ebean.ext.Finder;

<#include "/java_imports.include">

@Entity
@Table(name = "${table.sqlName}")
//@EbeanService("ebeanServer")
public class ${className}Entity extends BaseEntity {
	<#list table.columns as column>
	<#if column_index==0>@Id
    @SequenceGenerator(name = "${className}Seq", sequenceName = "S_${table.sqlName}", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "${className}Seq")</#if>
	private ${column.javaType} ${column.columnNameLower};  <#if column.remarks??>//${column.remarks}</#if>
	</#list>

	public static Finder<Long, ${className}Entity> find = new Finder<>(${className}Entity.class);

	@Override
    public void init()
    {
        super.init();
    }

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

	public ${className} toModel()
    {
        ${className} model = new ${className}();

        <#list table.columns as column>
		model.set${column.columnName}(this.get${column.columnName}());
		</#list>

        return model;
    }

    public ${className}Entity fromModel(${className} model)
    {
    	<#list table.columns as column>
    	this.set${column.columnName}(model.get${column.columnName}());
		</#list>
        
        return this;
    }
}
