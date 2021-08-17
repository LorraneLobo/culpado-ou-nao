import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();
        List<String> perguntas = new ArrayList<>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};

        //Percorre a lista, faz a pergunta e guarda na lista de respostas
        perguntas.forEach(pergunta -> {
            System.out.println(pergunta);
            String resposta = sc.nextLine();
            respostas.add(resposta);
        });

        //filtra a quantidade de resposta positiva/'s'
        long quantidade = respostas.stream()
                .filter(resposta -> resposta.equalsIgnoreCase("s"))
                .count();

        //verifica em qual caso se encaixa e imprime na tela
        switch ((int) quantidade){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3: case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
}
