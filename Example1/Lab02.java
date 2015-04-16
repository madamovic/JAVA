import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        int x;
        int y;
        int multiplied;
        IO.output("Enter an integer, x:");
        x=IO.inputInteger();
        IO.output("Enter an integer, y:");
        y=IO.inputInteger();
        multiplied=x*y;
        IO.outputln("Answer = " + multiplied);
        
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        int width;
        int height;
        double area;
        IO.output("Enter the width of the triangle:");
        width=IO.inputInteger();
        IO.output("Enter the height of the triangle:");
        height=IO.inputInteger();
        area=(width*height)/2.0;
        IO.outputln("The triangle area = " + area);
        
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        double a;
        double b;
        double c;
        double first;
        double second;
        
        IO.output("Enter a: ");
        a=IO.inputDouble();
        IO.output("Enter b: ");
        b=IO.inputDouble();
        IO.output("Enter c: ");
        c=IO.inputDouble();
        
        first=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        second=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        IO.outputln("First solution for x = " + first);
        IO.outputln("Second solution for x = " + second);
        
        
        
    }
}
