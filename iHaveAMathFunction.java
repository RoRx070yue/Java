import java.util.*;

public class iHaveAMathFunction {
    public static void main(String args[]){
	System.out.printfln("f(-3.2)=%.4f",f(-3.2));
	System.out.printfln("f(-2.1)=%.4f",f(-2.1));
	System.out.printfln("f(0)=%.4f",f(0));
	System.out.printfln("f(2.1)=%.4f",f(2.1));
    }

    public static double f(double x){
	return 3*Math.pow(x,3)+2*x-1;
    }
}
