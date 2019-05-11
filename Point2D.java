//autorzy: Marta Rosinska i Adrian Matyszczak
// cel: Shape
public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
    this.x = x;
    this.y = y;
    }

    public Point2D()
    {

    }
    public float getX() {
        return x;
    }
    public void setX(float sX) {
        x = sX;
    }
    public float getY() {
        return y;
    }
    public void setY(float sY) {
        y = sY;
    }
    public void setXY(float sX, float sY)
    {
        x = sX;
        y = sY;
    }
    public float getXY() {
        return 
    }
    public String toString()
    {
        return "(x = "+x+"y = "+y+")";
    }
}

