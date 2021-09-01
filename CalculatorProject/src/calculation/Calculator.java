package calculation;

public class Calculator {
   int a=40,b=30,add,sub,mul,div,squ;
   
  public void addition()
  {
	  add=a+b;
	  System.out.println("Addtion Value is:"+add);
  }
  public void subtraction()
  {
	  sub=a-b;
	  System.out.println("Subtraction Value is:"+sub);
  }
  public void multiplication() {
	mul=a*b;
	System.out.println("Multiplication Value is:"+mul);
}
  public void division() {
	div=a/b;
	System.out.println("Division Value is:"+div);
}
  public void square() {
	a=a*2;
	b=b*2;
	squ=a+b;
	squ=squ*2;
	System.out.println("Square value of a:"+a);
	System.out.println("Square value of b:"+b);
	System.out.println("A and B square value:"+squ);
}
	public static void main(String[] args) {
	Calculator addDetails=new Calculator();
	addDetails.addition();
    addDetails.subtraction();
    addDetails.multiplication();
    addDetails.division();
    addDetails.square();
    
	}

}
