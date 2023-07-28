package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    Employee(int id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }
    public void addHealthPlan(int index, String name){
        try {
            if (healthPlans[index] == null) {
                healthPlans[index] = name;
            } else {
                System.out.println("index has a value");

            }

            }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("there is no such index" + index);
        }

    }
    public String toString(){
        return "fullName= " + fullName + " email= " + email + " password= " + password + " healthPlan= " + Arrays.toString(healthPlans);
    }
}
