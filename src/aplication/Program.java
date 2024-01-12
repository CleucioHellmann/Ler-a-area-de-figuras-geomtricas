package aplication;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    /*
       ***** Métados abstratos*****
        O progrma deve ler N dados de figuras (fornecido pelo usuario),
         depois mostrar as áreas destas figuras na mesma ordem que foram digitadas.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Informe a quantidade de figuras: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Dados da figura #" + i + ":");
            System.out.print("Qual o farmato da figura? Retangulo ou Circulo (r/c)? ");
            char formato = sc.next().charAt(0);

            System.out.print("Qual a cor da figura? (BLACK/BLUE/RED) ");
            Color color = Color.valueOf(sc.next());
            if (formato == 'r'){
                System.out.print("Digite a largura: ");
                double largura = sc.nextDouble();
                System.out.print("Digite a altura: ");
                double altura = sc.nextDouble();
                list.add(new Rectangle(color, largura, altura));
            }else {
                System.out.print("Digite o raio do circulo: ");
                double raio = sc.nextDouble();
                list.add(new Circle(color, raio));
            }
        }

        System.out.println("-----Area das figuras-----");
        for (Shape shape : list){
            System.out.printf("%.2f%n",shape.area());
        }

        sc.close();
    }
}
