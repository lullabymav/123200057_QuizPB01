/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

/**
 *
 * @author Lenovo
 */
public class Android implements FinalWeighting{
    // attribute
    public String name;
    public String nim;
    public double write;
    public double coding;
    public double interview;
    public double writeResult;
    public double codingResult;
    public double interviewResult;
    public double totalResult;
    // constructor

    public Android(String name, String nim, double write, double coding, double interview) {
        this.name = name;
        this.nim = nim;
        this.write = write;
        this.coding = coding;
        this.interview = interview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getWrite() {
        return write;
    }

    public void setWrite(double write) {
        this.write = write;
    }

    public double getCoding() {
        return coding;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public double getInterview() {
        return interview;
    }

    public void setInterview(double interview) {
        this.interview = interview;
    }
    
    // method 
    @Override
    public void MenghitungWrite() {
        writeResult = write * 0.2;
    }

    @Override
    public void MenghitungCoding() {
        codingResult = coding * 0.5;
    }

    @Override
    public void MenghitungInterview() {
        interviewResult = interview * 0.3;
    }
    
    public void Total(){
        totalResult = writeResult + codingResult + interviewResult;
    }
}
