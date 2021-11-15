package com.springdemo.mvc;


import com.springdemo.validation.mvc.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull()
    @Size(min=1,message ="is required")
    private String lastName;
    @NotNull()
    @Min(value=0,message="least value is 0")
    @Max(value=10,message="max value is 10")
private Integer freePasses;
    @Pattern(regexp="^[a-z-Z0-9]{5}",message="only 5 characters or digits")
    private String postalCode;
    @CourseCode(value="TOPS",message = "must start with TOPS")
    private String courseCode;
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }
}
