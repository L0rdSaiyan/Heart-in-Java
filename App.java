import java.util.Scanner;
public class App
{

public static void main(String []args) throws Exception
{
    
 Scanner scanner = new Scanner(System.in);

      Heart coracao = new Heart();

 System.out.println("Informe o nome da pessoa: ");
  coracao.nome=scanner.nextLine();
   scanner.close();
  
   coracao.MostrarCoracao();

 }
}