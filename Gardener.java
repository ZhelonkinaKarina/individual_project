package individual_project;

class Gardener extends Owner {
    private Garden garden;

    public Gardener(String name, Garden garden) {
        super(name);
        this.garden = garden;
    }

    public void plantPlants() {
        String season = getSeason();

        switch (season) {
            case "зима":
                System.out.println(name + " садить ялівець, тую, магонію та барбарис");
                garden.addPlant("Ялівець");
                garden.addPlant("Туя");
                garden.addPlant("Магонія");
                garden.addPlant("Барбарис");
                break;
            case "весна":
            	System.out.println(name + " садить тюльпани, нарциси, крокуси та проліски");
                garden.addPlant("Тюльпан");
                garden.addPlant("Нарцис");
                garden.addPlant("Крокус");
                garden.addPlant("Пролісок");
                break;
            case "літо":
                System.out.println(name + " садить гвоздику, мальву, ромашку та дзвіночок");
                garden.addPlant("Гвоздика");
                garden.addPlant("Мальва");
                garden.addPlant("Ромашка");
                garden.addPlant("Дзвіночок");
                break;
            case "осінь":
            	System.out.println(name + " садить троянди, іриси, півонії та конвалії");
                garden.addPlant("Троянда");
                garden.addPlant("Ірис");
                garden.addPlant("Півонія");
                garden.addPlant("Конвалія");
                break;
            default:
                System.out.println("Невідома пора року");
                break;
        }
    }
}