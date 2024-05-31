package com.utils;

import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


public class ReadCsv 
{
   public static List<String[]> readCSV(String filePath)
   {
    if(filePath == null || filePath.isEmpty())
    {
        throw new IllegalArgumentException("La ubicacion es nula o esta vacia!!!");
    }
    List<String[]> records = new ArrayList<>();
    try(CSVReader csvReader = new CSVReader(new FileReader(filePath)))
    {
        String[] values;
        while ((values = csvReader.readNext())!=null) 
        {
            records.add(values);   
        }
    }catch(IOException | CsvValidationException e){
        System.err.println("Error al leer el archivo" + e.getMessage());
        e.printStackTrace();
    }
    return records;

   }
   public static void main(String[] args) {
    List<String[]> datos = ReadCsv.readCSV("C:\\Users\\Gerardo\\Desktop\\demo\\src\\test\\resources\\datosComprador.csv");
    System.out.println(String.join(", ", datos.get(0)));
   }

}
