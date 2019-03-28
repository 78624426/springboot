package hzn.emp.bean;

public class Emp {
    Integer id;
    String name;
    Double sal;

    public Emp(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.sal = salary;
    }

    public Emp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }
}
