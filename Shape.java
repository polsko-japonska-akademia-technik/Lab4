//autorzy: Marta Rosinska i Adrian Matyszczak
// cel: Shape

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape()
    {
        super();
    }
    public Shape (String color, boolean filled)
    {
        public String getColor()
        {
            this.color = color;
        }
    }
    public void setColor (String color)
    {
        this.color = color;
    }
    public boolean isFilled()

    {
        this.filled = filled;
    }
    public void setFilled (boolean filled)
    {
        this.filled = filled;
    }
    public String toString()
    {
        return "A Shape with color of"+color+"and "+filled;
    }
}