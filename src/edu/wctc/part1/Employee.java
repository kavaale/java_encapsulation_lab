package edu.wctc.part1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
 */
public class Employee {

    public String firstName;
    public String lastName;
    public String ssn;
    public boolean metWithHr;
    public boolean metDeptStaff;
    public boolean reviewedDeptPolicies;
    public boolean movedIn;
    public String cubeId;
    public LocalDate orientationDate;

    public Employee(String _firstName, String _lastName, String _ssn, String _cubeId){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.ssn = _ssn;
        this.cubeId = _cubeId;
    }

    private void setMetWithHr(boolean _metWithHr) {
        this.metWithHr = _metWithHr;
    }
    private boolean getMetWithHr() {
        return this.metWithHr;
    }

    private void setMetDeptStaff(boolean _metDeptStaff) {
        this.metDeptStaff = _metDeptStaff;
    }
    private boolean getMetDeptStaff() {
        return this.reviewedDeptPolicies;
    }

    private void setReviewedDeptPolicies(boolean _reviewedDeptPolicies) {
        this.reviewedDeptPolicies = _reviewedDeptPolicies;
    }
    private boolean getReviewedDeptPolicies() {
        return this.reviewedDeptPolicies;
    }

    private void setMovedIn(boolean _movedIn) {
        this.movedIn = _movedIn;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private String getLastName() {
        return this.lastName;
    }

    private String getCubeId() {
        return this.cubeId;
    }

    private String getSsn() {
        return this.ssn;
    }

    private void setOrientationDate(LocalDate _orientationDate) {
        this.orientationDate = _orientationDate;
    }
    private LocalDate getOrientationDate() {
        return this.orientationDate;
    }

}
