package employeeApp;

import org.w3c.dom.ls.LSOutput;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        HealthPlan healthPlan = new HealthPlan(1, "x", Plan.GOLD);

        String [] healthPlans = new String[3];
        healthPlans[0] = healthPlan.getName();

        Employee employee = new Employee(1, "cemreguvenilir", "guvenilircemre@gmail.com", "password", healthPlans );
        System.out.println(employee);

        employee.addHealthPlan(1, "z");
        System.out.println(employee);

        String[] developerNames = new String[3];
        developerNames[0] = employee.getFullName();
        Company company = new Company(1, "Workintech", 2000, developerNames );
        System.out.println(company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }



}
