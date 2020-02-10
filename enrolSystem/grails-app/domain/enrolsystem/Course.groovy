package enrolsystem

class Course {

String department; 
String courseTitle;
String courseLeader;
String courseCode;
String studyMode;
Date startDate;
Date endDate;
String description;
Integer numberOfStudents;
Double tuitionFees;

    static constraints = {
department nullable: false
department blank: false
courseTitle nullable: false
courseTitle blank: false
courseLeader nullable: false
courseLeader blank: false
courseCode nullable: false
courseCode blank: false
studyMode nullable: false
studyMode blank: false
studyMode minSize:20
startDate nullable: false
startDate blank: false
endDate nullable: false
endDate blank: false
description nullable: false
description blank: false
description maxSize:5000
description widget:'textarea'
numberOfStudents nullable: false
numberOfStudents blank: false
numberOfStudents minSize:20
numberOfStudents maxSize:60
tuitionFees nullable: false
tuitionFees blank: false
tuitionFees scale:2
    }
}
