package com.librerianacional.models;

import com.librerianacional.util.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Libros {

    private static ArrayList<Map<String, String>> libros= new ArrayList<>();

    public static String data(int posicion, String columna){

        try {
            libros = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "libros");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String result = libros.get(posicion).get(columna);

        return result;
    }

}
