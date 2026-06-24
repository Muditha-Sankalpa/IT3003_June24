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

    public abstract void displayRole();
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

    public void displayRole() {
        System.out.println("Role: Doctor");
    }

    public void displayDetails() {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Doctor ID: " + getId());
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Patient extends HospitalMember {
    private String diseaseDetails;

    public Patient(String name, String id, String diseaseDetails) {
        super(name, id);
        this.diseaseDetails = diseaseDetails;
    }

    public String getDiseaseDetails() {
        return diseaseDetails;
    }

    public void displayRole() {
        System.out.println("Role: Patient");
    }

    public void displayDetails() {
        System.out.println("Patient Name: " + getName());
        System.out.println("Patient ID: " + getId());
        System.out.println("Disease: " + diseaseDetails);
        System.out.println();
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Kamal", "101", "Cardiology");
        Patient patient1 = new Patient("Nimal", "201", "Fever");
        Patient patient2 = new Patient("Sunil", "202", "Diabetes");

        HospitalMember[] members = {doctor1, patient1, patient2};

        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===\n");
        
        for (HospitalMember member : members) {
            member.displayRole();
            member.displayDetails();
        }

        System.out.println("=== DETAILED VIEW ===\n");
        
        HospitalMember memberRef;
        memberRef = doctor1;
        memberRef.displayRole();
        memberRef.displayDetails();
        memberRef = patient1;
        memberRef.displayRole();
        memberRef.displayDetails();
    }
}