import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter numbers : ");
        float h,w,r;
        float PIE = (float) 3.1416;
        h = input.nextFloat();
        w = input.nextFloat();
        r = input.nextFloat();

        float Area1,Area2,Area3;

        Area1 = PIE*r*r;
        System.out.println("Area of Circle is : "+Area1);
        Area2 = (float) (0.5*h*w);
        System.out.println("Area of Triangle is : "+Area2);
        Area3 = h*w;
        System.out.println("Area of Rectangle is : "+Area3);

        if (Area1 > Area2 && Area1 > Area3) {
            System.out.println("Area of Circle is largest \n" +Area1);
        }
        else if (Area2 > Area1 && Area2>Area3){
            System.out.println("Area of Triangle is largest \n" +Area2);
        }
        else System.out.println("Area of the Rectangle is largest : "+Area3);
    }
}
