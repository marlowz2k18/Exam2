package ie.marlowe;

public class Employee {
    private String name;
    private String empNumb;

    public Employee(){
        name = "";
        empNumb = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        boolean validName;
        if(validName(n)){
            name = n;
        } else {
            throw new IllegalArgumentException("Invalid length of name");
        }

    }

    private boolean validName(String n) {
        boolean valid = true;
        if(n.length()!=5){
            valid = false;
        }
        return valid;
    }

    public String getEmpNumb() {
        return empNumb;
    }

    public void setEmpNumb(String num) {
        if(validNum(num)){
            empNumb = num;
        } else {
            throw new IllegalArgumentException("Invalid employee number");
        }
    }




    private boolean validNum(String num) {
        boolean real = true;
        if(num.length()!=5){
            real = false;
        }
        return real;
    }




}
