class Address{
    String houseNo;
    String city;
    String country;

    public Address(String houseNo, String city, String country) {
        this.houseNo = houseNo;
        this.city = city;
        this.country = country;
    }
}

class Employee {
    String name;
    Address address;

    public Employee( String name, Address address){
        this.name=name;
        this.address=address;
    }
    public void displayDetails() {
        System.out.println(address.houseNo + " " + address.city + " " + address.country);
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address a1 = new Address("HN209","faridabad","INDIA");
    Employee e1 = new Employee("kunal",a1);
    e1.displayDetails();
    }
}
