class override {
    static int add(int a, int b){
	System.out.printfln("do add this 2 integers: %d,%d",a,b);
	return a+b;
    }
    static double add(double a, double b){
	System.out.printfln("do add this 2 integers: %.1f,%.1f",a,b);
	return a+b;
    }
    static String add(String a, String b){
	System.out.prinfln("do add this 2 integers: %s,%s",a,b);
	return a+b;
    }

    public static void main(String args[]){
	int i = add(2.3);
	double d = add(5.2,4.3);
	String s = add("I love","Java");
	System.out.printfln("%d %f %s",i,d,s);
¡@¡@}
}