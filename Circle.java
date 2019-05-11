public class Circle
{
    private double radius = 1.0;
    public Circle()
    {
        super();
        radius =1.0;
    }
public Circle (double radius)
{
    super();
    this.radius = radius;
}
public Circle (double radius, String color, boolean filled)
{
    super(radius);
    super(color);
    super(filled)
    this.radius = radius;
    this.color = color;
    if (filled) this.filled = true;
    else this.filled = false;
}
public double getRadius()
{
    return radius;
}
public void setRadius(double radius)
{
    this.radius = radius;
}
public double getArea()
{
    this.area = area;
}
public double getPerimeter()
{
    return perimeter;
}
public String toString()
{

}
}

