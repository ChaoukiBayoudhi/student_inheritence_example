import java.util.Scanner;

public class Student {
    //Attributs
    private int id;
    private String name;
    private String email;
    private int level;
    private String groupName;
    //constructeur non parametré
    //initilase les attributs par des valeurs par defaut
    public Student() {
        this.id=0;
        this.name="";
        this.email="";
        this.level=1;
        this.groupName="";
    }
    //constructeur paramétré
    public Student(int id, String name, String email, int level, String groupName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.level = level;
        this.groupName = groupName;
    }

    //getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void afficher()
    {
        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", groupName='" + groupName + '\'' +
                '}');
    }
    public void saisir()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("id ? = ");
        this.id=sc.nextInt();
        System.out.println("name ? = ");
        this.name=sc.nextLine();
        this.name=sc.nextLine();
        System.out.println("email ? = ");
        this.email=sc.next();
        //this.email=sc.next();
        System.out.println("group name ? = ");
        this.groupName=sc.next();
        System.out.println("level ? = ");
        this.level=sc.nextInt();
    }
}
