package com.stackroute;

import java.util.Comparator;
/*b. Create a `StudentSorter` class that implements `Comparator interface` .*/
public class StudentSorter implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        if(o1.getAge()<o2.getAge())
        {
            return 1;
        }
        else if(o1.getAge()==o2.getAge()){
            return compareNames(o1,o2);
        }
        return -1;
    }
    private int compareNames(Student o1,Student o2){
        if(o1.getName().compareTo(o2.getName())<0){
            return -1;
        }
        else if(o1.getName().compareTo(o2.getName())==0){
            return compareIDs(o1,o2);
        }
        return 1;
    }
    private int compareIDs(Student o1,Student o2){
        if(o1.getId()<o2.getId()){
            return 1;
        }
        return -1;
    }
}
