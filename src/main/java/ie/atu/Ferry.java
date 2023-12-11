package ie.atu;

public class Ferry extends Ship{
    private int passengers;

    public Ferry(){
    }

    public Ferry(int passengers, String name, String year, int crew){
        super(name, year, crew);
        this.passengers = passengers;
    }
    public int getPassengers() {return passengers;}

    public void setPassengers(int passengers){this.passengers = passengers;}
    void vesselDetails () {
        System.out.println("The name of the ship is:" + name, "\n the max number of passengers is:" + passengers);
    }
}
