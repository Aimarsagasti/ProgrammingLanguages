package ex1;

public class myNumber {
	
	private int num, sum;
	public int num2;
	
	public myNumber(int num, int num2) {
		
		this.num = num;
		this.num2 = num2;
		
	}
	
	int getNum() {
		
		return num;
		
	}
	
	int getNum2() {
			
			return num2;
			
		}
	
	float average() {
		
		sum = num + num2;
		
		return sum/2;
		
	}


	
	void description() {
		
		System.out.println("The value of num1: "+this.num);
		System.out.println("the value of num2: "+this.num2);
		
	}

	void setNum(int i) {
		
		num = i;
		num2 = 10 * i;
		
	}
	
	
	
}
