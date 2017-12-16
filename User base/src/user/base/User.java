/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.base;

import java.util.Calendar;

/**
 *
 * @author Rivs
 */
public class User {
    private String name, surname;
    private String site = "N/A";
    private final int id;
    private Calendar joindate = Calendar.getInstance(), contract = Calendar.getInstance();
    private boolean isActive;
    
    User(String name, String surname, int id)
    {
        this.name=name;
        this.surname=surname;
        this.id=id;
        isActive=true;
    }
    User(String name, String surname, int id, int joinday, int joinmonth, int joinyear, int contday, int contmonth, int contyear)
    {
        this.name=name;
        this.surname=surname;
        this.id=id;
        setJoinDate(joinday, joinmonth, joinyear);
        setContractDate(contday, contmonth, contyear);
        isActive=true;
    }
    boolean setJoinDate(int day, int month, int year)
    {        
        joindate.set(year, month-1, day);        
        return true;
    }
    boolean setContractDate(int day, int month, int year)
    {        
        contract.set(year, month-1, day);
        return true;
    }    
    String assignSite(String site)
    {
        this.site = site;
        return "Site assigned";
    }
    boolean isActive()
    {
        return isActive;
    }
    String deactivate()
    {
        if(!isActive)
        {
            return "Already not active";
        }
        else
        {
            isActive = false;
            return "User deactivated";
        }
    }
    String activate()
    {
        if(isActive)
        {
            return "Already active";
        }
        else
        {
            isActive = true;
            return "User activated";
        }
    }
    @Override
    public String toString()
    {
        return "ID: " + String.format("%06d ", id) + String.format("%17s, %15s", surname, name) + "\t @" + String.format("%.3S", site) + " | Joined: " + String.format("%1$td/%1$tm/%1$tY", joindate) + " | End day: " + String.format("%1$td/%1$tm/%1$tY ", contract) + (isActive()? "": "Deactivated") ;
    }
}