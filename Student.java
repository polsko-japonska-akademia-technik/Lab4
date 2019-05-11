public class Student
{
    private String program;
    private int year;
    private double fee;

    public Student (String name, String address, String program, int year, double fee)
    {
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram()
    {
        return program;
    }
    public String setProgram()
    {
        return program;
    }
    public int getYear()
    {
        return year;
    }
    public double getFee()
    {
        return fee;
    }
    public void setFee(double fee)
    {
        this.fee = fee;
    }


    public String toString()
    {
        return "Name "+ name+",Address = " +address+",Program = " +program+",fee = " +fee;
    }

}
