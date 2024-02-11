

class MarioKartPlayer {
    private String playerName;
    private String character;
    private int speed;
    public MarioKartPlayer(String playerName, String character, int speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public void boost() {
        // Simulating boost by increasing speed by 10
        speed += 10;
    }
    public void displayInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }
}

public class MarioKartGame {
    public static void main(String[] args) {
        // Instantiate two MarioKartPlayer objects
        MarioKartPlayer player1 = new MarioKartPlayer("Player 1", "Mario", 50);
        MarioKartPlayer player2 = new MarioKartPlayer("Player 2", "Luigi", 45);

        // Display information of both players
        System.out.println("Player 1 Information:");
        player1.displayInfo();
        System.out.println("\nPlayer 2 Information:");
        player2.displayInfo();

        // Simulate boost action for each player
        player1.boost();
        player2.boost();

        // Display updated information of both players after boost
        System.out.println("\n Information after Boost:");
        System.out.println("Boosted Information of Player 1:");
        player1.displayInfo();
        System.out.println("\nBoosted Information of Player 2:");
        player2.displayInfo();
    }
}


