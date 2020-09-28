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
class App {
    private Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("--- Работа со строкой ---");
        System.out.println("-------------------------------");
//        Задание: Программа просит ввести строку и 
//        1. выводит количество символов в строке
//        2. удаляет указанную подстроку.
//        3. заменяет указанную подстроку на другую
//        4. удаляет все теги html из строки
//        5. удаляет указанный тэг из строки 
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------");*/
        
        
        System.out.println("Программа может выполнить следующие задачи: ");
        System.out.println("1. вывести количество слов в строке");
        System.out.println("2. найти указанную строку в исходной");
        System.out.println("3. заменить указанную подстроку на другую");
        System.out.println("4. удалить все теги html из строки");
        System.out.println("5. удалить указанный тэг из строки");
        System.out.println("-------------------------------");
        
        System.out.println("Введите исходную строку латиницей строку: ");
        
        String str = scanner.nextLine();
        //-----------------------------------------
        System.out.println("Выберите задачу: ");
        String task = scanner.nextLine();
        switch (task) {
            case "1":
                System.out.println("Вы выбрали: ");
                System.out.println("1. вывести количество слов в строке ");
                System.out.println("В строке  слов: " +this.getCountWords(str));
                /*if(str.isEmpty()){
                    System.out.println("Встроке нет слов");*/
                    break;
                
               /* int countWords = 0;
                
                System.out.println("В строке "+countWords);
                /*System.out.println("букв: " + this.getCountLetters(str));
                break;*/
            case "2":
                System.out.println("Вы выбрали: ");
                System.out.println("2. найти указанную строку в исходной строке");
                int n = this.searchSubString(str);
                if(n >=0 ){
                    System.out.println("Строка есть");
                }else{
                    System.out.println("Строки нет");
                    }
                break;
            case "3":
                System.out.println("Вы выбрали: ");
                System.out.println("3. заменить искомую строку на указанную");
                System.out.println("Результат: "+ this.replaceString(str));
                break;
            case "4":
                System.out.println("Вы выбрали: ");
                System.out.println("4. удалить все теги html из строки");
                /*<html><head><title>Hello</title></head>This text<body></body></head>*/
                System.out.println("результат: "+this.deleteTeg(str));
                break;
            case "5":
                System.out.println("Вы выбрали: ");
                System.out.println("5. удалить указанный тэг из строки");
                System.out.println("\nРезультат: \n"+deleteOneTeg(str));
                break;
            default:
                System.out.println("Нет такой задачи.");;
        }
        System.out.println("=== конец программы ===");
    }

    /*private int getCountLetters(String str) {
        char[] chStr = str.toCharArray();
        int n = 0;
        for (int i = 0; i < chStr.length; i++) {
            if(chStr[i] != ' ' && chStr[i] != ','
                && chStr[i] != '.'&& chStr[i] != ':'
                && chStr[i] != ';'){
                n++;
            }
        }
        return n;
    }*/
    private int getCountWords(String str){
        if(str.isEmpty()){
                    /*System.out.println("Встроке нет слов");*/
                    return 0;
        }
        String[] arrStr = str.split(" ");
                return arrStr.length;

}
     private int searchSubString (String str){
        System.out.println("введите искомую строку");
        String subStr = scanner.nextLine();
        
        return str.indexOf(subStr);
        
    }

    private String replaceString(String str) {
        System.out.println("введите искомую строку (latin)");
        String subStr = scanner.nextLine();
        System.out.println("На что заменить (latin)");
        String replaceStr = scanner.nextLine();
        StringBuffer sb= new StringBuffer();
        int firstIndex = str.indexOf(subStr);
        int endIndex = firstIndex + subStr.length();
        sb.replace(firstIndex,endIndex,replaceStr);
        return sb.toString();
    }

    private String deleteTeg(String str) {
        System.out.println("Введите исходную строку (latin): ");/*отладка*/
        str = scanner.nextLine();/*отладка*/
        str="<html><head><title>Hello</title></head>This text<body></body></head>";/*отладка*/
        String strNoTeg=str;
        /*String tmp =str;отладка*/
        String strTeg;
        int n;/*отладка*/
        int m = 0;/*отладка*/
        
        System.out.println("Введённая строка: \n"+str);
        
        while(strNoTeg.indexOf('>')!=-1){
        strTeg = strNoTeg.substring(strNoTeg.indexOf('<') , strNoTeg.indexOf('>')+1);
        n=strNoTeg.indexOf('<');
        m=strNoTeg.indexOf('>');
            System.out.println("n=strNoTeg.indexOf('<'): "+n);/*отладка*/
            System.out.println("m=strNoTeg.indexOf('>'): "+m);/*отладка*/
                
        System.out.println("Выреземая строка с тегами: "+strTeg);/*отладка*/
        strNoTeg = strNoTeg.replace(strTeg, " ");
        System.out.println("Строка без тегов: "+strNoTeg);/*отладка*/

        }
    System.out.println("Строка без тегов: "+strNoTeg);/*отладка*/
        return strNoTeg;            
    
}
    private String deleteOneTeg(String str){
        System.out.println("Введите удаляемый тег без'<','>' (latin): ");
        String teg = scanner.nextLine();
        
        str="<html><head><title>Hello</title></head>This text<body></body></head>";/*отладка*/
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
        
        System.out.println("Строка без тегов: \n"+strNoTeg);/*отладка*/
        return strNoTeg;
    }
}
