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
public class CandidateB extends Candidate{
    private final String b = "Toan,Hoa,Sinh";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String getB() {
        return b;
    }

    @Override
    public String toString() {
        return super.toString() + ",Tổ Hợp:" + b;
    }
    

    
}
