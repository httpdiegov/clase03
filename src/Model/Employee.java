package Model;


import java.sql.Date;

public class Employee {
    public Employee(int employeeId, String lastname, String firstname, String title, Date birthDate, String country, String email) {
        this.employeeId = employeeId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.title = title;
        this.birthDate = birthDate;
        this.country = country;
        this.email = email;
    }

    public Employee(){

    }

    private int employeeId;
    private String lastname;
    private String firstname;
    private String title;
    private Date birthDate;
    private String country;
    private String email;


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
