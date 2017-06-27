package sox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class SoxMain {

    public static void main(String[] args) throws IOException {

        String[] salsa;
        String[] library;
        String filename1 = "Salsa.txt";
        String filename2 = "library.txt";

        salsa = readSalsa(filename1);
        library = readLibrary(filename2);
        duplicateCompare(salsa, library);
    }

    static void duplicateCompare(String[] salsa, String[] library) throws NumberFormatException, IOException {
        PrintWriter writer = new PrintWriter("Results.xls");

        for (String salsaEntry : salsa) {
            if (!Arrays.asList(library).contains(salsaEntry)) {
                writer.write(salsaEntry + "\r\n");
            }
        }
        writer.close();
    }

    static String[] readSalsa(String filename1) throws IOException {

        //Reads the file Salsa.txt
        BufferedReader in = new BufferedReader(new FileReader(filename1));
        String str = null;
        ArrayList<String> lines = new ArrayList<String>();
        int i = 0;

        while ((str = in.readLine()) != null) {
            lines.add(str);
        }

        String[] fileName = lines.toArray(new String[lines.size()]);

        in.close();
        return fileName;

    }

    static String[] readLibrary(String filename1) throws IOException {

        //Reads the file Salsa.txt
        BufferedReader in = new BufferedReader(new FileReader(filename1));
        String str = null;
        ArrayList<String> lines = new ArrayList<String>();
        int i = 0;

        while ((str = in.readLine()) != null) {
            lines.add(str);
        }

        String[] fileName = lines.toArray(new String[lines.size()]);
        in.close();
        return fileName;
    }
}
