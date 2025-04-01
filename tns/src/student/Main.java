package student;
//Student class
class Student {
// Default constructor
public Student() {
   System.out.println("Student object is created");
}
}

//Commission class
class Commission {
private String name;
private String address;
private String phone;
private double salesAmount;
private double commission;

// Method to accept details of the sales employee
public void acceptDetails(String name, String address, String phone, double salesAmount) {
   this.name = name;
   this.address = address;
   this.phone = phone;
   this.salesAmount = salesAmount;
   calculateCommission();
}

// Method to calculate commission
private void calculateCommission() {
   if (salesAmount >= 100000) {
       commission = salesAmount * 0.10;
   } else if (salesAmount >= 50000 && salesAmount < 100000) {
       commission = salesAmount * 0.05;
   } else if (salesAmount >= 30000 && salesAmount < 50000) {
       commission = salesAmount * 0.03;
   } else {
       commission = 0;
   }
}

// Method to display commission details
public void displayCommissionDetails() {
   System.out.println("Name: " + name);
   System.out.println("Address: " + address);
   System.out.println("Phone: " + phone);
   System.out.println("Sales Amount: " + salesAmount);
   System.out.println("Commission: " + commission);
}
}

public class Main {
 public static void main(String[] args) {
     // Create a Student object
     Student student = new Student();

     // Create a Commission object
     Commission commission = new Commission();

     // Accept details of the sales employee
     commission.acceptDetails("John Doe", "123 Main St", "123-456-7890", 120000);

     // Display commission details
     commission.displayCommissionDetails();
 }
}
