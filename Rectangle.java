//autorzy: Marta Rosinska i Adrian Matyszczak
// cel: Shape
public class Rectangle {
    private double width = 1.0;
    private double lenght = 1.0;
    public Rectangle()
    {
        super();
    }
    public Rectangle (double width, double lenght)
    {
        this.lenght=lenght;
        this.width=width;
    }
    public Rectangle (double width, double lenght, String color, boolean filled)
    {
        public double getWidth()
        {
            this.width=width;
        }
        public void setWidth(width double)
        {
            this.width=width;
        }
        public double getLength()
        {
            this.lenght=lenght;
        }
        public void setLenght(double lenght)
        {
            this.lenght=lenght;
        }
        public double getArea()
        {
            return width*lenght;
        }
        public double getPerimeter()
        {
            this.width*2+this.lenght*2;
        }
        public String toString()
        {
            return "prostokat";
        }

    }
}
