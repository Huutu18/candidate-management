/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidates;

/**
 *
 * @author Admin
 */
public class CandidateA extends Candidate{
    public final String a = "Toan,Ly,Hoa";

    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String getA() {
        return a;
    }

    @Override
    public String toString() {
        return super.toString() + ",Tổ Hợp:" + a;
    }
    
}
