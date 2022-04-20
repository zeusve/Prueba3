import java.util.*;

public class Practica {
    public static void main(String[] args) {
        //ejercicio 1
        List<String> lista = new ArrayList<String>();
        //recorremos del 1 al 100
        for (int i = 1; i <= 100; i++) {
            //añadimos a la lista la palabra ciberclick a los multiplos q son multiplos de 3 y 5 al mismo tiempo
            if (0 == i % 3 && 0 == i % 5) {
                lista.add("cyberclick");
            }
            //añadimos a la lista la palabra cyber a los multiplos de 3
            else if (0 == i % 3) {
                lista.add("cyber");
            }
            //añadimos a la lista la palabra click a los multiplos de 5
            else if (0 == i % 5) {
                lista.add("click");
            }
            //añadimos el número a la lista si no se cumplen las condiiciones anteriores
            else lista.add(Integer.toString(i));
        }
        //imprimimos lista por pantalla
        System.out.println(lista);

        //ejercicio 2
        System.out.println("Introduce la contraseña a validar: ...");
        Scanner teclado = new Scanner(System.in);
        String pass = teclado.nextLine();
        check1(pass);
        check2(pass);
    }

    //Recorremos la contraseña y comprobamos cuantas veces se repiten los caracteres según la politica de contraseñas
    public static void check1(String pass) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (char d : pass.toCharArray()) {
            switch (d) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
                default:
                    break;
            }
        }
        //comprobamos las veces q se ha repetido cada caracter e imprimimos por pantalla el resultado
        if (a >= 1 && a < 4 || b >= 1 && b < 4 || c >= 2 && a < 10)
            System.out.println("Tú contraseña es correcta para el ejercicio 1");
        else System.out.println("Tú contraseña es inocrrecta para el ejercicio 1");
    }

    //Recorremos la contraseña y comprobamos si el caracter coincide con la posición según la politica de contraseñas
    public static void check2(String pass) {
        Boolean check = false;
        int i = 1;
        for (char c : pass.toCharArray()) {
            if (i == 1 && c == 'a' || i == 1 && c == 'b' || i == 3 && c == 'a' || i == 3 && c == 'b' || i == 2 && c == 'c' || i == 9 && c == 'c') {
                check = true;
            }
            i++;
        }
        System.out.println("Tú contraseña: " + pass + " es " + check + " para la parte 2 del ejercicio");
    }
}
