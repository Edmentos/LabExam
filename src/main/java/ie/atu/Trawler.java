package ie.atu;

public class Trawler extends Ship{
    private int cargo;

    public Trawler(){
    }

    public Trawler(int cargo, String name, String year, int crew){
        super(name, year, crew);
        this.cargo = cargo;
    }
    public int getCargo() {return cargo;}

    public void setCargo(int cargo){this.cargo = cargo;}

    void vesselDetails () {
        System.out.println("The name of the ship is:" + name, "\n the cargo capacity is:" + cargo);
    }
}



