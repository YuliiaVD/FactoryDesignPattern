package app;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your type: ");
        client.run(input.nextLine());

    }

    public void run(String type) {
        if(type.equals("Car")) {
            TransportFactory carFactory = new CarFactory();
            Transport car = carFactory.createTransport();
            car.move();
        } else if (type.equals("Plane")) {
            TransportFactory planeFactory = new PlaneFactory();
            Transport plane = planeFactory.createTransport();
            plane.move();
        } else {
            System.out.println("The type is not exiting");
        }
    }


}
