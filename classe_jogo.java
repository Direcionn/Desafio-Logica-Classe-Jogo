import java.util.Scanner;
public class classe_jogo{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nomeHeroi;
        int idade;
        int classe;

        System.out.println("Digite o nome do herói: ");
        nomeHeroi = scanner.nextLine();
        System.out.println("Digite a idade do herói: ");
        idade = scanner.nextInt();
        System.out.println("Digite a classe do herói: 1-mago, 2-guerreiro, 3-monge, 4-ninja");
        classe = scanner.nextInt();

        atacar(classe);

        scanner.close();
    }

    static void atacar(int classeAtaque){
        switch(classeAtaque){
            case 1:
            System.out.println("O mago usa ataque do tipo mágico.");
            break;
            case 2:
            System.out.println("O guerreiro usa espada para atacar.");
            break;
            case 3:
            System.out.println("O monge utiliza artes marciais para lutar.");
            break;
            case 4:
            System.out.println("O ninja utiliza shuriken em seus ataques.");
            break;
            default:
            System.out.println("Classe de herói desconhecida.");
        }
    }
}
