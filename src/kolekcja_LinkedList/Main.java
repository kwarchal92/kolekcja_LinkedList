package kolekcja_LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List lista = new LinkedList();

        //wstawia elementy alfabetu od A do Z do listy o nazwie lista
        for (char znak = 'A'; znak <= 'Z'; znak++)
        {
            lista.add(znak); //dodanie do listy kolejnych znakow
        }

        System.out.println("Elementy A do Z");
        for (int i = 0; i < lista.size(); i++)
        {
            if (i < lista.size() -1)
                System.out.print(lista.get(i) + ", ");
            else
                System.out.print(lista.get(i) + ". ");
        }

        System.out.println();

        Collections.reverse(lista); //Odwrocenie listy

        System.out.println("Elementy Z do A");
        for (int i = 0; i < lista.size(); i++)
        {
            if (i < lista.size() -1)
                System.out.print(lista.get(i) + ", ");
            else
                System.out.print(lista.get(i) + ". ");
        }

        System.out.println();
    }
}
