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
public class AppTest5 {
    private Scanner scanner = new Scanner(System.in);
    
    public void run(){
        System.out.println("Введите удаляемый тег без'<','>' (latin): ");
        String teg = scanner.nextLine();
        
        String str="<html><head><title>Hello</title></head>This text<body></body></head>";
        String first= "<";
        String second= "</";
        String last = ">";
        String strNoTeg = str;
        String strTegFirst = first+teg +last;
        System.out.println("strTegFirst: "+strTegFirst);
        String strTegSecond = second+teg +last;
        System.out.println("strTegSecond: "+strTegSecond);
        System.out.println("Выреземый тег: "+strTegFirst+", "+strTegSecond);
        
        System.out.println("Введённая строка: \n"+str);
        strNoTeg = strNoTeg.replace(strTegFirst, "");
        strNoTeg = strNoTeg.replace(strTegSecond, "");
        
        System.out.println("Строка без тегов: \n"+strNoTeg);
        
        
    }
}
