public class Teacher implements Cloneable{
    private int id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone method");
        return super.clone();
    }


    public interface TeacherInterface {
        void method();
    }
}
