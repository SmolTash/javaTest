package com.vetasi;
/**
 * Created by smolka.tash on 26.02.2018.
 */

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.vetasi.Utils.writeToExcel;


public class Main {
    public static void main(String[] args) {

         try {
             if (compareStrings ("Vetasi", "Vetasi")){
                 String dDate="01.04.1986";
                 DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
                 Date date = formatter.parse(dDate);

                 int age = getAge (date);
                 writeToExcel (Integer.toString(age));
             }

         } catch (IOException e) {
             e.printStackTrace();
         } catch (ParseException e) {
             e.printStackTrace();
         }

    }

    static boolean compareStrings(String stringA, String stringB) {
        return stringA.equals(stringB);
    }

    static int getAge(Date dateOfBirth) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateOfBirth);
        return cal.get(Calendar.YEAR);
    }
}
