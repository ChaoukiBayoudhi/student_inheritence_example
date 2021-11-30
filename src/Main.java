import java.util.Scanner;
public class Main {
    public static int studentMenu()
    {
        System.out.println("Veuillez selectionner un choix :");
        System.out.println("1-afficher");
        System.out.println("2-saisir");
        System.out.println("3.Retour(<-)");
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.print("Votre choix : ");
            choice=sc.nextInt();
        }while(choice<1||choice>3);
        return choice;
    }
    public static int principalMenu()
    {
        System.out.println("Veuillez selectionner un choix :");
        System.out.println("1-gestion Etudiant");
        System.out.println("2-gestion Etudiant Terminal");
        System.out.println("3.Quitter l'application");
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.print("Votre choix : ");
            choice=sc.nextInt();
        }while(choice<1||choice>3);
        return choice;
    }
    public static void main(String[] args)
    {
        int choice;
        do {
            choice = Main.principalMenu();
            //si la methode main(String[] args) et la methode statique
            //à appeler sont dans la même classe
            //la méthode est appelée sans le nom de la classe
            //ou
            //principalMenu();
            int choiceSt;
            switch (choice) {
                case 1:
                    Student st = new Student();
                    do {
                        choiceSt = studentMenu();
                        switch (choiceSt) {
                            case 1:
                                System.out.println("Informations de l'étudiant :");
                                st.afficher();
                                break;
                            case 2:
                                st.saisir();
                                break;
                        }//fin switch(choiceSt)
                    }while(choiceSt!=3);
                    break;

                case 2:
                    StudentTerminal stt = new StudentTerminal();
                    do {
                        choiceSt = studentMenu();
                        switch (choiceSt) {
                            case 1:
                                System.out.println("Informations de l'étudiant :");
                                stt.afficher();
                                break;
                            case 2:
                                stt.saisir();
                                break;
                        }
                    }while(choiceSt!=3);
                    break;
                default:
                    System.exit(1);//pour quitter

            }

        }while(choice!=3);
    }
}
