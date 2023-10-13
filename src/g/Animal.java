package g;

class Animal implements Nameable {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String getName() {
        return name + " (" + species + ")";
    }
}