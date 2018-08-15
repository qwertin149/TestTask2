/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtask;
import java.io.*;
/**
 *
 * @author Sergei
 */
public class FileTool {

    static int[] result;
    public static int[] getArray(String file){
    
        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr))
        {
            String line = br.readLine();
            String[] numbersStrings = line.split(",");
            int[] numbers = new int[numbersStrings.length];
            for (int i = 0; i < numbersStrings.length; i++)
            {
                numbers[i] = Integer.parseInt(numbersStrings[i]);
            }
            result = numbers;
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
