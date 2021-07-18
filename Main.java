/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidates;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ManagementCandidate managementCandidate = new ManagementCandidate();
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("1.  Add New Candidate");
            System.out.println("2.  Display Candidate Information ");
            System.out.println("3.  Search Candidate By ID ");
            System.out.println("0.  Exit");
            System.out.print("Enter TC (0,1,2,3) : ");
            int sum;
            sum = sc.nextInt();
            switch(sum){
                case 1:{
                    System.out.println("a.  Add CandidateA");
                    System.out.println("b.  Add CandidateB");
                    System.out.println("c.  Add CandidateC");
                    System.out.print("Enter TC (a,b,c) : ");
                    String check;
                    check = sc.next();
                    switch(check){
                        case "a":{
                            String ID , name, address;
                            int priority;
                            System.out.print("Enter ID: ");
                            ID = sc.next();
                            System.out.print("Enter name: ");
                            name = sc.nextLine();
                            System.out.print("Enter address: ");
                            address = sc.next();
                            System.out.print("Enter priority: ");
                            priority = sc.nextInt();
                            CandidateA candidateA = new CandidateA(ID, name, address, priority);
                            managementCandidate.add(candidateA);
                            System.out.println(candidateA);
                            break;
                        }
                        case "b":{
                            String ID , name, address;
                            int priority;
                            System.out.print("Enter ID: ");
                            ID = sc.next();
                            System.out.print("Enter name: ");
                            name = sc.next();
                            System.out.print("Enter address: ");
                            address = sc.next();
                            System.out.println("Enter priority: ");
                            priority = sc.nextInt();
                            CandidateB candidateB = new CandidateB(ID, name, address, priority);
                            managementCandidate.add(candidateB);
                            System.out.println(candidateB);
                            break;
                        }
                        case "c":{
                            String ID , name, address;
                            int priority;
                            System.out.print("Enter ID: ");
                            ID = sc.next();
                            System.out.print("Enter name: ");
                            name = sc.next();
                            System.out.print("Enter address: ");
                            address = sc.next();
                            System.out.println("Enter priority: ");
                            priority = sc.nextInt();
                            CandidateC candidateC = new CandidateC(ID, name, address, priority);
                            managementCandidate.add(candidateC);
                            System.out.println(candidateC);
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    managementCandidate.display();
                    break;
                }
                case 3:{
                    String ID;
                    System.out.print("Enter ID search : ");
                    ID = sc.next();
                    managementCandidate.search(ID);
                    break;
                }
                case 0:{
                    System.exit(sum);
                    break;
                }
            }
            
        } while (true);
    }
}
