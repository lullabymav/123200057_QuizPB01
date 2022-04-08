/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpbo1;

import calculation.Android;
import calculation.Web;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        int choose, choice = 0;
        String nim = null;
        String name = null;
        double write = 0, coding = 0, interview = 0;
        double totalResult;
        
        // new scanner
        Scanner input = new Scanner(System.in);
        
        Android callAn = new Android (name, nim, write, coding, interview);
        Web callWeb = new Web (name, nim, write, coding, interview);
        
        do {
            System.out.println("REGISTRATION FORM PT.JUAN");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Choose Form Type : ");
            choose = input.nextInt();
            System.out.println(); 
            
            System.out.println("REGISTRATION FORM");
            System.out.println();
            System.out.print("Input Student Number : ");
            nim = input.next();
            System.out.print("Input Name : ");
            name = input.next();
            
            do{
                System.out.print("Input Writing Exam Score : ");
                write = input.nextInt();
                System.out.print("Input Coding Test Score : ");
                coding = input.nextInt();
                System.out.print("Input Interview Test Score : ");
                interview = input.nextInt();    

                if(choose == 1){
                    callAn.setName(name);
                    callAn.setNim(nim);
                    callAn.setWrite(write);
                    callAn.setCoding(coding);
                    callAn.setInterview(interview);

                    do {
                        System.out.println("Menu");
                        System.out.println("1. Edit");
                        System.out.println("2. Output");
                        System.out.println("3. Exit");
                        System.out.print("Choose : ");
                        choice = input.nextInt();

                        if (choice == 1){
                            System.out.print("");
                        }else if (choice == 2){
                            callAn.MenghitungWrite();
                            callAn.MenghitungCoding();
                            callAn.MenghitungInterview();
                            totalResult = callAn.writeResult + callAn.codingResult + callAn.interviewResult;
                            callAn.getName();
                            System.out.println("Final Score : " + totalResult);
                            if (totalResult >= 85){
                                System.out.println("INFORMATION : SUCCESS");
                                System.out.println("Congratulation to " + callAn.getName() + " has been accepted as Android");
                            }else{
                                System.out.println("INFORMATION : FAILED");
                                System.out.println("Sorry to " + callAn.getName() + ", you are not accepted as Android");
                            }
                            System.out.println();
                        }
                    }while (choice != 3);  
                }else if (choose == 2){
                    callWeb.setName(name);
                    callWeb.setNim(nim);
                    callWeb.setWrite(write);
                    callWeb.setCoding(coding);
                    callWeb.setInterview(interview);
                    
                    do {
                        System.out.println("Menu");
                        System.out.println("1. Edit");
                        System.out.println("2. Output");
                        System.out.println("3. Exit");
                        System.out.print("Choose : ");
                        choice = input.nextInt();

                       if (choice == 2){
                            callWeb.MenghitungWrite();
                            callWeb.MenghitungCoding();
                            callWeb.MenghitungInterview();
                            totalResult = callWeb.writeResult + callWeb.codingResult + callWeb.interviewResult;
                            callWeb.getName();
                            System.out.println("Final Score : " + totalResult);
                            if (totalResult >= 85){
                                System.out.println("INFORMATION : SUCCESS");
                                System.out.println("Congratulation to " + callWeb.getName() + " has been accepted as Web");
                            }else{
                                System.out.println("INFORMATION : FAILED");
                                System.out.println("Sorry to " + callWeb.getName() + ", you are not accepted as Web");
                            }
                            System.out.println();
                        }
                    }while (choice != 3 && choice != 1);
                }
            }while(choice == 1);      
        }while (choice == 3);   
    }
    
}
