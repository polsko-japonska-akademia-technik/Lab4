//autorzy: Marta Rosinska i Adrian Matyszczak
// cel: Shape
public class Staff
{
    private String school;
    private double pay;

    public Staff (String name, String address, String school, double pay)
    {
        super (name, address);
        this.school = school;
        this.pay = pay;
    }
 public String getSchool()
 {
     return school;
 }
 public void setschool (String school)
 {
     this.school=school;
 }
 public double getPay()
 {
     return pay;
 }
 public void setPay (double pay)
 {
     this.pay = pay;
 }

 public String toString()
 {
     return "Name "+ super.toString()+name+",Address = " +address+",school = " +school+",pay = " +pay;
 }

}
