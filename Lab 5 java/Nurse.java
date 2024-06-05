package InheritanceQ2;

//Nurse.java
public class Nurse extends Doctor {
 public void treatment() {
     System.out.println("Nurse is Providing treatment to a patient");
 }

 public static void main(String[] args) {
     // Create an instance of Surgeon and call the inherited surgery method
     Surgeon surgeon = new Surgeon();
     surgeon.surgery();  // Output: Performing a surgery

     // Create an instance of Nurse and call both surgery and treatment methods
     Nurse nurse = new Nurse();
     nurse.surgery();    // Output: Performing a surgery
     nurse.treatment();  // Output: Providing treatment to a patient
 }
}

