package ie.atu;

public class Ship {
    private String name;
    private String year;
    private int crew;


    public Ship(){
    }



    public Ship(String name, String year, int crew){
        this.name = name;
        this.year = year;
        this.crew = crew;
    }
    public String getName() { return name; }

    public void setName() { this.name = name; }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    public int getCrew() { return crew; }

    public void setCrew(int crew) { this.crew = crew; }


        void vesselDetails () {
        System.out.println("The name of the ship is:" + name, "\n the year it was built is:" + year, "\nThe minimum crew requirement is:" + crew);
    }



















}
