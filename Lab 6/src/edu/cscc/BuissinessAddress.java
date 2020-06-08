package edu.cscc;

public class BuissinessAddress extends Address {
    private String businessName, address2;

    public BuissinessAddress(String streetAddress, String city, String state, String zip, String businessName, String address2) {
        super(streetAddress, city, state, zip);
        this.businessName = businessName;
        this.address2 = address2;
    }
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void printLabel(){
        System.out.println(getBusinessName());
        if (getAddress2()!="" && getAddress2()!=null){
            System.out.println(getAddress2());
        }
        if (getStreetAddress()!="" && getStreetAddress()!=null){
            System.out.println(getStreetAddress());
        }
        System.out.println(getCity()+ ", " +getState()+ "  " +getZip());
    }
}
