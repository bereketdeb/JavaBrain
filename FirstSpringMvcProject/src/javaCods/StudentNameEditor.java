package javaCods;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String studetName) throws IllegalArgumentException {
		
		if(studetName.contains("Ms.") || studetName.contains("Mr.")){
			setValue(studetName);
		}else{
			studetName = "Ms."+ studetName;
			setValue(studetName);
		}
		
	}
	
	

}
