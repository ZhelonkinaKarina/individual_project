package individual_project;

import java.util.ArrayList;
import java.util.List;

class Garden {
    private List<String> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void addPlant(String plant) {
        plants.add(plant);
    }

    public void printStatus() {
        Owner owner = new Owner("Каріна");
        List<String> purchasePlants = owner.getPurchasePlants();

        System.out.println("Закуплені рослини на наступну пору року:");
        for (String plant : purchasePlants) {
            System.out.println("- " + plant);
        }

        Gardener gardener = new Gardener("Данило", this);
        gardener.plantPlants();
        
        System.out.println("Посаджені рослини:");
        for (String plant : plants) {
            System.out.println("- " + plant);
        }
    }
}