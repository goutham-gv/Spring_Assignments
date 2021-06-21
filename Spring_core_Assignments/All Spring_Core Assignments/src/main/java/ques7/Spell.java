package ques7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class Spell {
	public String nameRegEx = "^[a-zA-Z\\s]+$";
	
	@Value("Java2Novice")
    private String empName;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public boolean isEmpNameValid() {
		return empNameValid;
	}

	public void setEmpNameValid(boolean empNameValid) {
		this.empNameValid = empNameValid;
	}

	@Value("#{spell.empName matches spell.nameRegEx}")
    public boolean empNameValid;
	
	public void general()
	{
		 ExpressionParser parser = new SpelExpressionParser();
		 System.out.println("\n");
		 System.out.println("Operators :");
		 System.out.println(parser.parseExpression("10 * 20").getValue()); 
		 System.out.println(parser.parseExpression("10==5").getValue()); 
		 System.out.println(parser.parseExpression("(10 > 5) and (5>3)").getValue());
		 System.out.println(parser.parseExpression("10 < 20? true: false").getValue());
		 System.out.println("\n");
		 System.out.println("REGEX :");
		 System.out.println(empNameValid);
		 
		 MulitplicationTest mulitplicationTest=new MulitplicationTest();
		 
		 StandardEvaluationContext context = new StandardEvaluationContext(mulitplicationTest);
		 
		 parser.parseExpression("num1").setValue(context,"10");  
		 parser.parseExpression("num2").setValue(context,"20"); 
		 System.out.println("\n");
		 System.out.println("Standard Evaluation :");
		 System.out.println(mulitplicationTest.multiplication());  
		 
		 System.out.println("\n");

	}

}
