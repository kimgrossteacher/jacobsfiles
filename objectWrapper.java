public class objectWrapper {
    public static void main(String[] args) {
        Game game1 = new Game("Minecraft", "PC", 45);
        Game game2 = new Game("Zelda: Breath of the Wild", "Nintendo Switch", 70);
        Game game3 = new Game("Halo Reach", "Xbox", 120);

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