/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counttags;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author iranjo_sd2082
 */
public class CountTags {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception {
       // pass the path to the file as a parameter
       File file
               = new File("C:\\Users\\iranjo_sd2082\\Desktop\\schools\\cit.txt");
       Scanner sc = new Scanner(file);

       int count = 0;
       while (sc.hasNextLine()) {
           String a = sc.nextLine();
           if (a.contains("div")) {
               count++;
           }
       }

       System.out.println(count);
   }

}  
