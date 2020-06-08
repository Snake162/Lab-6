package edu.cscc;

public class Main {

    public static void main(String[] args) {
	    Address[] addressList =
                {
                        new BuissinessAddress("550 East Spring St.", "Columbus", "OH", "43215", "Columbus State", "Eibling 302B"),
                        new BuissinessAddress("", "Columbus", "OH", "43201", "AEP", "P.O. Box 2075"),
                        new BuissinessAddress("2079 N. Main. St.", "Columbus", "OH", "43227","Bill's Coffee", ""),
                        new PersonAddress("1200 N. Fourth St.", "Worthington", "OH", "43217", "Saul Goodman"),
                        new PersonAddress("207 Main St.", "Reynoldsburg", "OH", "43211", "Mike Ehrmentraut"),
                        new PersonAddress("2091 Elm St.", "Pickerington", "OH", "43191", "Gustavo Fring"),
                };
	    for (Address address : addressList) {
	        address.printLabel();
            System.out.println("====================");
        }
    }
}
