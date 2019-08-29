package studio1;
import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args){

    ArgsProcessor n1 = new ArgsProcessor(args);
        double i1 = n1.nextDouble("Enter value for n1");
    ArgsProcessor n2 = new ArgsProcessor(args);
        double i2 = n2.nextDouble("Enter value for n2");

        double numAverage = (i1+i2)/2;

        System.out.println(numAverage);
    }
}
