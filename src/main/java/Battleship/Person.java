package Battleship;

public class Person {
    private String name;
    private String pathToCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathToCard() {
        return pathToCard;
    }

    public void setPathToCard(String pathToCard) {
        this.pathToCard = pathToCard;
    }

    public Person (String name, String pathToCard) {
        this.name = name;
        this.pathToCard = pathToCard;
    }



}
