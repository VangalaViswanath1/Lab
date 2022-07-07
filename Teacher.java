
class TeacherOne{
    String CollegeName = "SVU";
    String Designation = "Teacher";
    void first(){                                               //first class method here
        System.out.println("Teacher is teaching here");
    }
}
class ITTeacher extends TeacherOne{
    void second(){                                              //second class method here
        System.out.println("IT Teacher is teaching CS here");
    }
}
class MathTeacher extends ITTeacher{
    void third(){                                                   //third class method here
        System.out.println(" Maths teacher is teaching Maths");
    }
}
class MusicTeacher extends MathTeacher{
    void fourth(){                                                    //fourth class method here
        System.out.println("Music Teacher is teaching music here");
    }
}
class PhysicTeacher extends MusicTeacher{
    void fifth(){                                                            //fifth class method here
        System.out.println("Physics teacher is teaching Physics");
    }
}


public class Teacher {
    public static void main(String[] args) {
        System.out.println("it's workling now");
    
        PhysicTeacher teach = new PhysicTeacher();              //Creating an object here
        teach.first();                                          //Printing the output here
        teach.second();
        teach.third();
        teach.fourth();
        teach.fifth();


    }
}
