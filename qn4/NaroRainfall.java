import java.util.Random;

public class NaroRainfall {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] rainfall = new double[30];
        
        // Generate 30 random readings
        for (int i = 0; i < 30; i++) {
            rainfall[i] = rand.nextDouble() * 60;
        }
        
        // Total and average
        double total = 0.0;
        for (double r : rainfall) {
            total += r;
        }
        double average = total / 30;
        
        System.out.printf("Total monthly rainfall: %.2f mm%n", total);
        System.out.printf("Average daily rainfall: %.2f mm%n", average);
        
        // Wet days
        int wetDays = 0;
        for (double r : rainfall) {
            if (r > 30) wetDays++;
        }
        System.out.println("Number of wet days: " + wetDays);
        
        // Classification
        if (total <= 300) {
            System.out.println("Month Classification: Dry");
        } else if (total <= 600) {
            System.out.println("Month Classification: Normal");
        } else {
            System.out.println("Month Classification: Flood-risk");
        }
    }
}