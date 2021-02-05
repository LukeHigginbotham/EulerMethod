/*
 *  Use Euler Method to solve any ordinary differential equation.
 *
 * CSC 2262 Euler Method Program Findings
 *
 * @author Luke Higginbotham 899568628
 * @since 12/2/2020 
 */
package eulermethod;

public class EulerMethod 
{
    //Main driver that creates a graph 
    public static void main(String[] args) 
    {
        EulerMethod obj = new EulerMethod();
        double x0 = 0;
        double h = 0.25;
        double x = 0.00;
        double y0 = 1;
        System.out.println("h\tx\tyh(x)");
        for(int i = 0; i < 5; i++)
        {
            System.out.printf("%.2f\t",h);
            System.out.printf("%.2f\t",x);
            x = x + 0.25;
            obj.EulerMethod(x0,y0,h,x);
        }
    }
    //Calculates the yh(x)
    void EulerMethod(double x0, double y, double h, double x) 
    { 
        double temp = -0; 
  
        // Iterating till approximation
        while (x0 < x) 
        { 
            temp = y; 
            y = y + h * function(x0, y); 
            x0 = x0 + h; 
        } 
        System.out.printf("%.4f\n",y); 
    } 
    //Method that holds and returns the given ordinary differential equation
    double function(double x, double y) 
    { 
        return (x * y + ((4 * x) / y)); 
    } 
    
}
