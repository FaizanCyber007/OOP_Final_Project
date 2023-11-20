// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addMaterial(new Material("Table", "Plastic", 200, 10));
        manager.addMaterial(new Material("Bicycle", "Iron", 400, 50));
        manager.addMaterial(new Material("Books", "Paper", 200,10));
        manager.addMaterial(new Material("Cage", "Iron", 400, 40));
        manager.displayMaterials();
        manager.removeMaterialByName("Bicycle");
        System.out.println();
        System.out.println();
        manager.displayMaterials();
    }
}