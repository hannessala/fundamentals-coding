package CircleArea;

/** To calculate the perimeter of the circle
 *
 */
public  class CircleArea {

    public float calculateCircleArea(float diameter) {
        float radius = diameter / 2;
        float circleArea = (float) (Math.PI * Math.pow(radius, 2));

        return circleArea;
    }
}