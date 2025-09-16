package org.example;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Scanner;

/*
2. Búsqueda de carácteres

Haz un programa que dado un fichero y un carácter cuente el número de ocurrencias de ese carácter en el fichero.
Variante: dado un fichero encuentre el carácter más usado.

 */

public class Main {



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe aquí el nombre del directorio: ");
        String inputFile = sc.nextLine();

        System.out.println("Escribe aquí una letra (Si no escribes ninguna, se sacara el caracteres más usado): ");

        String inputChar = sc.nextLine();

        Path f = new File(inputFile).toPath();

        if (f.toFile().exists()) {
            if (inputChar.equals("")) {
                characterMaxRepeatCount(f);
            } else {

            }
        } else {
            System.out.println("El archivo no existe.");
        }


    }

    static void characterMaxRepeatCount(Path file) throws IOException {
        String text = Files.readString(file);
        char[] charArray = text.toCharArray();

        }
    }

