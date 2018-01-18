/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author vesko
 */
public class Question29 {

    public static int GetElementCount(int number) {
        int result = number == 1 ? 1 : (number - 1) * 4;
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Enter number:");
            String s = br.readLine();
            if("exit".equals(s)) System.exit(0);
            int num = Integer.parseInt(s);
            System.out.println("Брой на квадратчета за съответния номер: "+ GetElementCount(num));
            int result=0;
            for(int i=1;i<=num;i++){
                result+=GetElementCount(i);
            }
            System.out.println("Общ брой квадратчета във фигурата: " + result);
      }
    }
    
}
