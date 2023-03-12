import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Pessoa <String>{
    private String name;
    private String sexo;

    public Pessoa(String name){

    }

    public static void pessoa() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nomes separando-os por virgula ',' :");
        java.lang.String resposta = sc.nextLine();
        java.lang.String[] pessoas = resposta.split(", ");

        Arrays.sort(pessoas);
        for(int i=0; i<pessoas.length; i++) {

            System.out.println(pessoas[i]);

        }

    }

    public static void pessoaParte2() {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome e o sexo separando por virgula 'Maria-F,' :");
        java.lang.String resposta = in.nextLine();
        java.lang.String[] pessoas = resposta.split(", ");

        System.out.println("*** Grupo Feminino ***");
        Arrays.sort(pessoas);
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].contains("-F")) {


                System.out.println(pessoas[i]);
            }
        }

        System.out.println("*** Grupo Masculino ***");
        Arrays.sort(pessoas);
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].contains("-M")) {


                System.out.println(pessoas[i]);
            }
        }

        in.close();

    }

    public Pessoa(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}



