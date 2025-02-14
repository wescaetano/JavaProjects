package aplication;

import model.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = fmt1.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = fmt1.parse(sc.next());
        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber,checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter date to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = fmt1.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = fmt1.parse(sc.next());


                String error = reservation.updateDates(checkIn, checkOut);
                if(error != null){
                    System.out.println("Error in reservation: " + error);
            } else{
                    System.out.println("Updated reservation: " + reservation);
                }
        }

    }
}
