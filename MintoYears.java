import java.util.Scanner;
public class MintoYears {
    public static void main(String[] args)
    {
        double minyear=365*24*60;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number");
        double min=input.nextDouble();
        long years=(long)(min/minyear);
        int days=(int)(min/minyear);
        System.out.println((int)min+" min is appoximately "+years+"years and"+days+"days");
    }
}
