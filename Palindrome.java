import java.util.Scanner;

public class Palindrome {
    
    public static boolean Palindromo(String Palabra) // usé boolean ya que regresa true o false
    {
        for(int i = 0; i < Palabra.length(); i++) //manda a llamar al String palabra length cuenta las letras
        {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1)) //detecta el caracter del principio con el comando charAt() (i) cuenta la lentra del principio - i - 1 compara con la letra final.
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String Palabra; //Variable que aloja la palabra que queremos saber si es palindromo
        Scanner palabrita = new Scanner(System.in);
        System.out.print("Escribe una palabra para determinar si es o no palindromo\n"); //Pide una palabra para determinar si es palindromo
        Palabra = palabrita.next();
        
        if (Palindromo(Palabra) == true) //Condición
        {
            System.out.println("es palindromo\n"); //Imprime esta frase si es palindromo
        } else
        {
            System.out.printf("no es palindromo\n"); //Imprime esta frase al si no es un palindromo
        }
        
    }
}
