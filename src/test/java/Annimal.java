class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}

class Mammal extends Animal {
    private String diet;

    public Mammal(String species, String diet) {
        super(species);
        this.diet = diet;
    }

    public String getDiet() {
        return diet;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String species, String diet, String breed) {
        super(species, diet);
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Dog Species: " + getSpecies());
        System.out.println("Diet: " + getDiet());
        System.out.println("Breed: " + breed);
    }
}