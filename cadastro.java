import java.util.Scanner;

class cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("login> ");
        String login = sc.next();



        System.out.println("senha>");
        String senha = sc.next();

        if(login.equals("" ) && senha.equals("")){
            System.out.printf("Senha segura.", senha);

        }else{
            System.out.println("Senha insegura");
        }
    }
}
