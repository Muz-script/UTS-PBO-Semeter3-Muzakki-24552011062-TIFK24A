enum Level {
    BEGINNER(0),
    INTERMEDIATE(100),
    EXPERT(500);

    // Field
    private int minPoint;

    // Constructor enum
    Level(int minPoint) {
        this.minPoint = minPoint;
    }

    // Getter
    public int getMinPoint() {
        return minPoint;
    }
}

public class Latihan2Enum {
    public static void main(String[] args) {

        // Contoh penggunaan enum
        Level level = Level.INTERMEDIATE;

        System.out.println("Level       : " + level);
        System.out.println("Min Point   : " + level.getMinPoint());

        // Loop semua enum
        System.out.println("\nDaftar Level:");
        for (Level l : Level.values()) {
            System.out.println(l + " - Minimal Poin: " + l.getMinPoint());
        }
    }
}
