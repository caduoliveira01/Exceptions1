package application;

import model.entities.Reservation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number:");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy):");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy):");
        Date checkOut = sdf.parse(sc.next());

        Reservation reservation = new Reservation(number , checkIn, checkOut);
        System.out.println("Reservation: "+reservation);

        System.out.println();
        System.out.println("Enter data to update the reservation:");
        System.out.println("Check-in date (dd/MM/yyyy):");
        checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy):");
        checkOut = sdf.parse(sc.next());

        reservation.updateDatas(checkIn, checkOut);
        System.out.println("Reservation: "+reservation);
        sc.close();
    }
}
