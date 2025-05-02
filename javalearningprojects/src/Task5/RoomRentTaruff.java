package Task5;

import java.util.Scanner;

public class RoomRentTaruff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sudha = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = sudha.nextInt();
        System.out.print("Enter the room rent per day: ");
        double rentPerDay = sudha.nextDouble();

        System.out.print("Enter the number of days stayed: ");
        int daysStayed = sudha.nextInt();

        boolean isPeakSeason = false;
        switch (month) {
            case 4: //April
            case 5: // May
            case 6: // June
            case 11: // November
            case 12: // December
                isPeakSeason = true;
                break;
            default:
                isPeakSeason = false;
        }

       
        double totalRent;
        if (isPeakSeason) {
            rentPerDay += rentPerDay * 0.20; // Increase by 20%
        }

        totalRent = rentPerDay * daysStayed;
        System.out.printf("Hotel Tariff: %.2f%n", totalRent);

        sudha.close();
    }
}


	