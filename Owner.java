package individual_project;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Owner {
    public String name;

    public Owner(String name) {
        this.name = name;
    }

    public List<String> getPurchasePlants() {
        List<String> purchasePlants = new ArrayList<>();
        String season = getSeason();

        switch (season) {
            case "зима":
                purchasePlants.add("Тюльпан");
                purchasePlants.add("Нарцис");
                purchasePlants.add("Крокус");
                purchasePlants.add("Пролісок");
                break;
            case "весна":
                purchasePlants.add("Гвоздика");
                purchasePlants.add("Мальва");
                purchasePlants.add("Ромашка");
                purchasePlants.add("Дзвіночок");
                break;
            case "літо":
                purchasePlants.add("Троянда");
                purchasePlants.add("Ірис");
                purchasePlants.add("Півонія");
                purchasePlants.add("Конвалія");
                break;
            case "осінь":
                purchasePlants.add("Ялина");
                purchasePlants.add("Туя");
                purchasePlants.add("Магнолія");
                purchasePlants.add("Барбарис");
                break;
            default:
                System.out.println("Невідома пора року");
                break;
        }

        return purchasePlants;
    }
    public void purchasePlants(List<String> plants) {
       System.out.println("Власниця " + name + " робить закупівлю рослин на наступну пору року:");

        for (String plant : plants) {
            System.out.println("- " + plant);
        }
    }
    public String getSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть поточну пору року:");
        String currentSeason = scanner.nextLine();
        return currentSeason;


    }
}