package chandu;

public enum Arith_ops {
	ADD ("Addition"),SUB ("Subtraction"),MUL ("Multiplication"),DIV ("Division");
	
	String operation;
	 Arith_ops(String operation){
		 this.operation=operation;
	 }
}