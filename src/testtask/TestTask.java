package testtask;


import java.io.*;
import java.util.*;
/**
 *
 * @author Sergei
 */
public class TestTask {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arr1 = FileTool.getArray("files/textfile1.txt");
        int[] arr2 = FileTool.getArray("files/textfile2.txt");
        Arrays.sort(arr2);
        int i = 0;
        while (arr1[i] == arr2[i])
            i++;
        System.out.println(arr1[i]);
    }
    
}
