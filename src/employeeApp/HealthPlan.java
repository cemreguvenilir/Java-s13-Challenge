package employeeApp;

public class HealthPlan {
    private int id;
    private String name;
    private Plan plan;

    HealthPlan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String toString(){
        return "id= " + id + " name= " + name + " plan= " + plan;
    }
}
