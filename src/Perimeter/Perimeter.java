package Perimeter;

/** To calculate the perimeter of the circle
 *
 */
public  class Perimeter {
    private final float PI = 3.14f;

    public float calculatePerimeter(float diameter) {
        float radius = diameter / 2;
        float perimeter = 2 * PI * radius;

        return perimeter;
    }
}