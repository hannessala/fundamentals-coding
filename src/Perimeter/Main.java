package Perimeter;

public class Main {
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();
        double resultPerimeter = perimeter.calculatePerimeter(6.234f);
        System.out.printf("Perimeter.Main.Perimeter: %f" ,resultPerimeter);
        System.out.println("Perimeter.Main.Perimeter: " + resultPerimeter + ", diameter =" + "6.234");
        System.out.printf("Perimeter.Main.Perimeter: %f, diameter = %s", resultPerimeter, "6.234");
    }

    /** To calculate the perimeter of the circle
     *
     */
    public static class Perimeter {
        private final float PI = 3.14f;
        public double calculatePerimeter(float diameter){
/*            float radius = diameter / 2;
            float perimeter = 2 * PI * radius;

            return perimeter;*/
            return (2 * Math.PI * (diameter /2));
        }
    }
}