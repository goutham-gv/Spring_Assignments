package ques2;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Question {

		private long questionId=9876;
		private String question="What are the names of Employee in Team B ?";
		
		@Autowired
		private List<String> answer1;
		
		@Autowired
		private Set<String> answer2;
		
		@Autowired
		private Map<Integer, String> answer3;
		
		public void viewDetails() {
			System.out.println("\n");
			System.out.println("Question ID :" +questionId);
			System.out.println("Question :" +question);
			System.out.print("Answer List: ");
			for(String ans:answer1) {
				System.out.print(ans+", ");
			}
	
			System.out.print("Answer Set: ");
			for(String ans:answer2) {
				System.out.print(ans+", ");
			}
			
			System.out.println();
			
			System.out.print("Answer Map: ");
			for(Map.Entry<Integer, String> ans:answer3.entrySet()) {
				System.out.println(ans.getKey()+", "+ ans.getValue());
			}
		}
		
		
}
