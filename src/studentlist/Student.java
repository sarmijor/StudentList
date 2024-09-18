package studentlist;

/**
 *
 * @author paulbonenfant
 * Wednesday September 18th
 */
public class Student {
    
//    First github change
    private String name;
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}
