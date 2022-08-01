package DailyTasks.Day39Recap.statesTask;

public class States {
    private String name,abbreviation,politicalParty,Governor, senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor( governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.equals(null)){
            System.err.println("Invalid Name");
            System.exit(0);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isEmpty()||abbreviation.equals(null)){
            System.err.println("Invalid abbreviation");
            System.exit(0);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }
    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.isEmpty()||politicalParty.equals(null)){
            System.err.println("Invalid political party");
            System.exit(0);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }
    public void setGovernor(String governor) {
        if(governor.isEmpty()||governor.equals(null)){
            System.err.println("Invalid governor");
            System.exit(0);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }
    public void setSenator(String senator) {
        if(senator.isEmpty()||senator.equals(null)){
            System.err.println("Invalid senator");
            System.exit(0);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        if(population<=0){
            System.err.println("Invalid entry"+population);
            System.exit(0);
        }
        this.population = population;
    }

    public double getStateTax() {

        return stateTax;
    }
    public void setStateTax(double stateTax) {
        if(stateTax<=0){
            System.err.println("Invalid entry"+stateTax);
            System.exit(0);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "States{" +
                "Name='" + name + '\'' +
                ", Abbreviation='" + abbreviation + '\'' +
                ", PoliticalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", Senator='" + senator + '\'' +
                ", Population=" + population +
                ", StateTax=" + stateTax +
                '}';
    }
}
/*
States Task:
1. Create a class named States:
variables:name, abbreviation, politicalParty,Governor, senator, population, stateTax
Encapsulate all the fields
Add a constructor that can set all the fields
Conditions:
1. name,abbreviation, politicalParty, Governor, and senator can not be null
2. name,abbreviation, politicalParty, Governor, and senator can not be empty
3. taxRatecan not be negative
4.Population can not be set to zero or negative
Methods:toString()
2. Create the following sub classes of States and add any additional
fields and methods if necessary:
1. Virginia
2. California
3. Texas
4. Florida
3. Create a class named StateObjects
Create the objects of each sub classes test all the functions of each objects
Analyze the relationships between the classes
 */