// This is the main class Question
public class Question214{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}

class Answer{
	Answer(){
		//
	}
	Answer(int marks, String type){		
      System.out.println("You got nothing.");
		System.out.println("You got "+marks+" for an "+ type);
	}
}
