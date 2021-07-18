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
public class CandidateC extends Candidate{
    private final String c = "Văn,Sử,Địa";

    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return super.toString() + "Tổ Hợp :" + c;
    }
    
}
