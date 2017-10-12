import java.util.Scanner;

public class brain {

	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		char operator='Z';
		while(operator!=0)
		{System.out.println("Enter any operator (+, -, *, /) to perform calculation: ");
        operator = in.next().charAt(0);
		
		switch(operator)
        {
            case '+':
            	Addition a = new Addition();
            	a.add(x, y);
            	System.out.println(a.getadd());
                break;

            case '-':
            	Subtraction s = new Subtraction();
            	s.sub(x, y);
            	System.out.println(s.getsub());
                break;

            case '*':
            	Multiplication m = new Multiplication();
            	m.mul(x, y);
            	System.out.println(m.getmul());
            	
                break;

            case '/':
            	Division d = new Division();
            	d.div(x, y);
            	
            	System.out.println(d.getdiv());
                break;

            default:
                System.out.printf("Operator is not correct!!!");
                return;
        }
		}
		in.close();

	}

}
