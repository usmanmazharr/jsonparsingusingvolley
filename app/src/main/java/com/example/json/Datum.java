
package com.example.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Datum {

    @SerializedName("Emp_ID")
    @Expose
    private String empID;
    @SerializedName("Emp_Name")
    @Expose
    private String empName;
    @SerializedName("Social_Media")
    @Expose
    private Object socialMedia;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Deignation")
    @Expose
    private String deignation;
    @SerializedName("Seniority")
    @Expose
    private String seniority;
    @SerializedName("Joining_Date")
    @Expose
    private String joiningDate;
    @SerializedName("Pay_Scale")
    @Expose
    private String payScale;
    @SerializedName("Salary")
    @Expose
    private String salary;
    @SerializedName("Allowed_holidays")
    @Expose
    private String allowedHolidays;
    @SerializedName("Availed_holidays")
    @Expose
    private Object availedHolidays;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Object getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(Object socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeignation() {
        return deignation;
    }

    public void setDeignation(String deignation) {
        this.deignation = deignation;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPayScale() {
        return payScale;
    }

    public void setPayScale(String payScale) {
        this.payScale = payScale;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAllowedHolidays() {
        return allowedHolidays;
    }

    public void setAllowedHolidays(String allowedHolidays) {
        this.allowedHolidays = allowedHolidays;
    }

    public Object getAvailedHolidays() {
        return availedHolidays;
    }

    public void setAvailedHolidays(Object availedHolidays) {
        this.availedHolidays = availedHolidays;
    }

}
