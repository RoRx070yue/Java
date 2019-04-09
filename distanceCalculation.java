import java.util.*;

public class distanceCalculation {
¡@¡@public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	int x1,x2,y1,y2;

	System.out.printf("Your Enter(x,y):");
	x1 = scan.nextInt();
	y1 = scan.nextInt();

	System.out.printf("Your Enter(x,y):");
	x2 = scan.nextInt();
	y2 = scan.nextInt();

	double dist = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

	System.out.printf("the distance between (%.2f,%.2f) and (%.2f,%.2f) is:%.2f",(double)x1,(double)y1,(double)x2,(double)y2,dist);
¡@¡@}
}