package master;

public class master_class {
    String name;
    int roll;

    master_class(String s,int r){
        this.name=s;
        this.roll=r;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
