// autorzy Marta Rosińska 18874 Adrian Matyszczak
// data wykonania 27.04.2019
// cel: Person

public class Person {
    private String name;
    private String address;

    public Person (String name, String address)
    {
        this.name= name;
        this.address = address;
    }

     public String getName()
     {
        return name;
    }

    public String getaddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }


    public String toString()
    {
        return "Name "+name+",Address = " +address;
    }

}


