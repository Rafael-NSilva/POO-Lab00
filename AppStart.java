/**
 * Mostrar as informações acerca do copo dependendo do tamanho
 * 
 * @author (Rafael Silva) 
 * @version (1.0)
 */

import java.util.Scanner;

public class AppStart
{
    public static void main(String [] args)
    {    
        Scanner scanner = new Scanner(System.in);
        char tipo = scanner.next().charAt(0);
        int number = 0;

        switch (tipo) {
            case 'S':
            {
                number+=1;
                System.out.println("Name         : " + Size.SMALL);
                System.out.println("toString()   : " + Size.SMALL.toString());
                System.out.println("Ordem        : " + number);
                System.out.println("Valor minimo : " + Size.SMALL.getMinValue());
                System.out.println("Valor máximo : " + Size.SMALL.getMinValue());
                System.out.println("Código       : " + Size.SMALL.getCode());
                break;
            }
            case 'M':
            {
                number+=1;
                System.out.println("Name         : " + Size.MEDIUM);
                System.out.println("toString()   : " + Size.MEDIUM.toString());
                System.out.println("Ordem        : " + number);
                System.out.println("Valor minimo : " + Size.MEDIUM.getMinValue());
                System.out.println("Valor máximo : " + Size.MEDIUM.getMinValue());
                System.out.println("Código       : " + Size.MEDIUM.getCode());
                break;
            }
            case 'L':
            {
                number+=1;
                System.out.println("Name         : " + Size.LARGE);
                System.out.println("toString()   : " + Size.LARGE.toString());
                System.out.println("Ordem        : " + number);
                System.out.println("Valor minimo : " + Size.LARGE.getMinValue());
                System.out.println("Valor máximo : " + Size.LARGE.getMinValue());
                System.out.println("Código       : " + Size.LARGE.getCode());
                break;
            }
        }
    }
}
