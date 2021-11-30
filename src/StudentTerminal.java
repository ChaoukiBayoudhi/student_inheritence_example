import java.util.Scanner;

public class StudentTerminal extends  Student{
    private double endOfStudyMark;
    //constructeur non parametré
    public StudentTerminal()
    {
        super();//appel au constructeur non paramétré de la classe mère
        this.endOfStudyMark=0.0;
    }
    //constructeur paramétré
    public StudentTerminal(int id,String name,String email,String groupName,int level,double endOfStudyMark)
    {
        super(id,name,email,level,groupName);//appel au constructeur paramétré de la classe mère
        this.endOfStudyMark=endOfStudyMark;
    }

    //getters setters


    public double getEndOfStudyMark() {
        return endOfStudyMark;
    }

    public void setEndOfStudyMark(double endOfStudyMark) {
        this.endOfStudyMark = endOfStudyMark;
    }
//redefinition de afficher()
    @Override //optionnelle en java
    public void afficher() {
        super.afficher();
        System.out.println("end of study mark = "+endOfStudyMark);
    }

    @Override
    public void saisir() {
        super.saisir();
        System.out.println("End of study mark ? = ");
        Scanner sc=new Scanner(System.in);
        this.endOfStudyMark=sc.nextDouble();
    }
}
