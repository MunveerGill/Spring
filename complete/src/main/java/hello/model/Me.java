package hello.model;

/**
 * Created by mgill on 24/02/2016.
 */
public class Me {

    private final String name = "Munveer Gill";
    private final Integer age = 20;
    private final String degree = "BSc Computer Science @ The University of Birmingham";
    private final String employer = "ANDigital";
    private final String title = "Intern AND Jet-Setter";
    private final String random;

    public Me(String random){
        this.random = random;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDegree(){
        return degree;
    }

    public String getEmployer(){
        return employer;
    }

    public String getTitle(){
        return title;
    }

    public String getRandom(){
        return random;
    }
}
