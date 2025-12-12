package com.ems_software_cscglobal;

import java.util.Date;

import com.ems_software_cscglobal.model.AccessCard;
import com.ems_software_cscglobal.model.Employee;
import com.ems_software_cscglobal.model.Manager;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to EMS software " );
        Employee varalakshmi = new Employee(19181, "Varalakshmi", 176000, "9876543211");
        Employee rashi = new Employee();
        Employee tanuja = new Employee(19191, "Tanuja", 100000);
        Employee naveeni = new Employee(181722, "Naveeni");

        naveeni.setSalary(56000);
        tanuja.changeSalary(25);
        varalakshmi.changeSalary(25,15);
        System.out.println("======rashi details");
        rashi.display();
        
        System.out.println("======varalakshmi details");
        varalakshmi.display();
        
        System.out.println("======tanuja details");
        tanuja.display();
        
        System.out.println("======naveeni details");
        naveeni.display();
               
        Manager suyog = new Manager(1999, "Syoug", 90000, "9918171771");
        suyog.setDepartment_id(1900);
        suyog.setManager_id(tanuja.getEmployeeId());
        
        suyog.changeSalary(110);
        
        System.out.println(suyog.getEmployeeName()+ " your salary is : "+suyog.getSalary());
        
        System.out.println(suyog);
        
        
        AccessCard accessCard = new AccessCard();
        accessCard.cardNumber = 121921212;
        accessCard.issueDate = new Date("12/12/2025");
        accessCard.chipCode = 2828;
        
        accessCard.activateCard();
        accessCard.issueTemporaryCard();
        accessCard.deactivateCard();
        
        System.out.println(accessCard);
    }
}