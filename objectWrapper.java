public class objectWrapper {
    public static void main(String[] args) {
        CustomObject game1 = new CustomObject("Minecraft", "PC", 45);
        CustomObject game2 = new CustomObject("Zelda: Breath of the Wild", "Nintendo Switch", 70);
        CustomObject game3 = new CustomObject("Halo Reach", "Xbox", 120);

        System.out.println("--- Initial Game Status ---");
        game1.displayInfo();
        game2.displayInfo();
        game3.displayInfo();

        System.out.println("\n--- Playing Games ---");
        game1.playGame(5);  
        game2.playGame(15); 

        System.out.println("\n--- Updated Game Status ---");
        game1.displayInfo();
        game2.displayInfo();
        game3.displayInfo();
    }
}