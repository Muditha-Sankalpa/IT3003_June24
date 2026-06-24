abstract class HospitalMember {
    private String name;
    private String id;

    public HospitalMember(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }

    public abstract String getRole();
    public abstract void displayDetails();
}

class Doctor extends HospitalMember {
    private String specialization;
    
    public Doctor(String name, String id, String specialization) {
        super(name, id);  
        this.specialization = specialization;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public String getRole() {
        return "Doctor";
    }

    public void displayDetails() {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Doctor ID: " + getId());
        System.out.println("Specialization: " + specialization);
    }
}

class Patient extends HospitalMember {
    private String disease;
    
    public Patient(String name, String id, String disease) {
        super(name, id);  // Calling parent constructor
        this.disease = disease;
    }
    
    public String getDisease() {
        return disease;
    }
    

    public String getRole() {
        return "Patient";
    }
    
    public void displayDetails() {
        System.out.println("Patient Name: " + getName());
        System.out.println("Patient ID: " + getId());
        System.out.println("Disease: " + disease);
    }
}


    public class HospitalManagement {
        public static void main(String[] args) {

            Doctor doctor1 = new Doctor("Kamal", "101", "Cardiology");
        Patient patient1 = new Patient("Nimal", "201", "Fever");
        
        HospitalMember[] members = new HospitalMember[2];
        members[0] = doctor1;
        members[1] = patient1;
        
        System.out.println("Role: " + members[0].getRole());
        System.out.println();
        System.out.println("Role: " + members[1].getRole());
            System.out.println();
           
            members[0].displayDetails();
            System.out.println();
            members[1].displayDetails();
        
            System.out.println("\n--- Alternative Display ---");
            System.out.println("Role: " + doctor1.getRole());
            System.out.println();
            System.out.println("Role: " + patient1.getRole());
            System.out.println();
            doctor1.displayDetails();
            System.out.println();
            patient1.displayDetails();
    }
}