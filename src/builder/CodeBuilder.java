package builder;

import java.util.ArrayList;
import java.util.List;

public class CodeBuilder
{
	private String className;
	
	private List<ClassAtribute> attributes;
	
	private static final String NEW_LINE = System.lineSeparator();
	
    public CodeBuilder(String className)
    {
    	this.className = className;
    	this.attributes = new ArrayList<>();
    }
    
    public CodeBuilder addField(String name, String type)
    {
    	this.attributes.add(new ClassAtribute(name, type));
    	return this;
    }
    
    @Override
    public String toString()
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append(String.format("public class %s", className)).append(NEW_LINE)
    	.append("{").append(NEW_LINE);
    	
    	for (ClassAtribute classAtribute : this.attributes) {
			sb.append("  ").append(String.format("public %s %s;", classAtribute.type, classAtribute.name)).append(NEW_LINE);
		}
    	
    	sb.append("}");
    	
    	return sb.toString();
    }
    
}
