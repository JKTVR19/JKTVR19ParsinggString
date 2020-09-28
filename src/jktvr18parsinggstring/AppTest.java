/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr18parsinggstring;
import java.util.Scanner;
/**
 *
 * @author Juri
 */
public class AppTest {
    private Scanner scanner = new Scanner(System.in);
    
    public void run(){
        System.out.println("Введите исходную строку (latin): ");
        String str = scanner.nextLine();
        str="<html><head><title>Hello</title></head>This text<body></body></head>";
        String strNoTeg=str;
        String tmp =str;
        String strTeg;
        int n;
        int m = 0;
        
        System.out.println("Введённая строка: \n"+str);
        
        while(strNoTeg.indexOf('>')!=-1){
        strTeg = strNoTeg.substring(strNoTeg.indexOf('<') , strNoTeg.indexOf('>')+1);
        n=strNoTeg.indexOf('<');
        m=strNoTeg.indexOf('>');
            System.out.println("n=strNoTeg.indexOf('<'): "+n);
            System.out.println("m=strNoTeg.indexOf('>'): "+m);
                
        System.out.println("Выреземая строка с тегами: "+strTeg);
        strNoTeg = strNoTeg.replace(strTeg, " ");
        System.out.println("Строка без тегов: "+strNoTeg);
        /*tmp = str.substring(0, str.lastIndexOf('<')).substring(tmp.lastIndexOf('>') + 1);
        System.out.println("tmp:"+tmp);*/
        /*if(strNoTeg.indexOf('>')+2)
            break;*/
        }
    System.out.println("Строка без тегов: "+strNoTeg);
    }
}
