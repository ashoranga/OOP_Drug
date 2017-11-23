/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopdrugs;

/**
 *
 * @author MERC-LAB-01
 */
public class OopDrugs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Vtm amo = new Vtm();
      amo.gname = "Amoxicillin";
      amo.formula = "FDSFDFFFTDDTU";
      amo.sideEffect = "stomach pain, nausea, vomiting, diarrhea, etc";
      
      Atm amofromSPC = new Atm();
      amofromSPC.tname = "Amoxicillin(SPC)";
      amofromSPC.manufacturer = "SPC";
      amofromSPC.vtm = amo;
      
      Atm amofromRx = new Atm();
      amofromRx.tname = "Amoxicillin(Rx)";
      amofromRx.manufacturer = "Rx";
      amofromRx.vtm = amo;   
      
      Vtm sal = new Vtm();
      sal.gname = "Salbutamaol";
      sal.formula = "gdhfgjfhkh";
      sal.sideEffect = "vomiting, diarrhea, etc";      
           
      Atm salfromSPC = new Atm();
      salfromSPC.tname = "Salbutamaol(SPC)";
      salfromSPC.manufacturer = "SPC";
      salfromSPC.vtm = sal;
      
      Vmp amo500 = new Vmp();
      amo500.vtm = amo;
      amo500.dosageform = "Capsule";
      amo500.strength = 500.0;
      amo500.strengthUnit = "mg";
      amo500.name = "Amoxicillin 500mg capsule";
      
      Vmp amo250 = new Vmp();
      amo250.vtm = amo;
      amo250.dosageform = "Capsule";
      amo250.strength = 250.0;
      amo250.strengthUnit = "mg";
      amo250.name = "Amoxicillin 250mg capsule";      
      
      Amp decamox500 = new Amp();
      decamox500.manufacturer = "Cipla";
      decamox500.name = "Decamox-500";
      decamox500.vmp = amo500;
               
      System.out.println(decamox500.name + " contains " +
                decamox500.vmp.vtm.gname + " " + decamox500.vmp.strength + 
                decamox500.vmp.strengthUnit +" in form of " +
        decamox500.vmp.dosageform );
      


// TODO code application logic here
    }
    
}
