/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidates;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ManagementCandidate {
    ArrayList<Candidate> candidates;

    public ManagementCandidate() {
        candidates = new ArrayList<Candidate>();
    }

    public void add(Candidate ca){
        this.candidates.add(ca);
    }
    
    public void display(){
        boolean temp = false;
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println("Candidate "+i+ ":" + candidates.get(i));
            temp = true;
        }
        if(temp == false){
            System.out.println("List empty!");
        }
    }
    public void search(String a){
        boolean temp = false;
        for (int i = 0; i < candidates.size(); i++) {
            if (a.compareToIgnoreCase(candidates.get(i).getId())==0) {
                System.out.println("Candidate "+i+ ":" + candidates.get(i));
                temp = true;
                break;
            }
        }
        if ( temp == false) {
            System.out.println("Error! Not have ID you want");
        }
    }
    
}
