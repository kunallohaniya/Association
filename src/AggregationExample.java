class Address{
    String houseNo;
    String street;
    String city;
    String country;

    public Address(String houseNo, String street, String city, String country) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.country = country;
    }
}

class Employee{
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println(address.houseNo + " " + address.street + " " + address.city + " " + address.country);
    }
}

public class AggregationExample{
    public static void main(String[] args) {
        Address a1 = new Address("HN: 6/209", "Kumhar Mohalla","Faridabad", "India");
        Employee e1 = new Employee("kunal prajapati", a1);
        e1.displayDetails();
    }
}


