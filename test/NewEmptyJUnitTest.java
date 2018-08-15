/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
import java.util.Arrays;
import junit.framework.Assert;
import testtask.FileTool;
import java.io.*;

/**
 *
 * @author Sergei
 */
public class NewEmptyJUnitTest {
    
    int[] arr1;
    String file;
    String file2;
    
    public NewEmptyJUnitTest() {
    }
    
    @Before
    public void setUp() {
        arr1 = FileTool.getArray(file);
        file = "files/textfile1.txt";
        file2 = "files/textfile2.txt";
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test()
    {
        
        // Проверка на отсортированность
        assertTrue(isSorted(arr1));
        // Проверка на корректность данных файлов по паттерну
        Pattern p = Pattern.compile('/^(?:\d\,?)+$/');  
        String line = getLine(file);
        String line2 = getLine(file2);
        Matcher m = p.matcher(line);  
        Matcher m2 = p.matcher(line2);
        assertTrue(m.matches()); 
        assertTrue(m2.matches());
        
    }
    
    public boolean isSorted(int[] data)
    {
        for(int i = 1; i < data.length; i++){
            if(data[i-1] > data[i]){
                return false;
            }
        }
        return true;
    }
    
    public String getLine(String file)
    {
        String line = null;
        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr))
        {
            line = br.readLine();
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return line;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
