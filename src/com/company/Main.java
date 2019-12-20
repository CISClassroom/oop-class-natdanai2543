package com.company;

public class Main {

    public static void main(String[] args) {

            // write your code here
            //System.out.print("Hello world");

            // create Student object
            Student mark = new Student();
            Student tae = new Student();
            Student moo = new Student();

            String name = "";

            //input data to Object
            mark.name = "P Mark";
            mark.id = "001";
            mark.major = "CIS";
            tae.name = "N Tae";
            tae.id = "110";
            tae.major = "CIS";
            moo.name = "P Moo";
            moo.id = "002";
            moo.major = "CIS";

            //get data from Object
            System.out.println("1. " + mark.name + " " + mark.major);
            System.out.println("2. " + tae.name + " " + tae.major);
            System.out.println("3. " + moo.name + " " + moo.major);

            // add student to array
            // array index
            Student[] oopStudent = {mark, tae, moo};

            System.out.println("1. " + oopStudent[0].name);
            System.out.println("2. " + oopStudent[1].name);
            System.out.println("3. " + oopStudent[2].name);

        }
        // TO Find_CIS_Student
        public static void Find_CIS_Student(Student[] students){
            for(int i = 0; i < students.length; i++){
                if (students[i].major == "CIS"){
                    System.out.print(students[i].name);
                }
            }
        }
    }

