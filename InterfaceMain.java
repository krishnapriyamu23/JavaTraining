public class InterfaceMain {
  public static void main(String args[]) {
    Textiles tex = new Textiles();
    tex.getMoney();
    Hospital hos = new Hospital();
    hos.printReceipt();
    hos.patientsAdmit();
    hos.enquiry();
    HyperMart hyp = new HyperMart();
    hyp.enquiry();
    hyp.Selection();
  }
}