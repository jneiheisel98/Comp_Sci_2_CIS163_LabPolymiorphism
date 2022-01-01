package proj2;

public class SuperExecutive extends Executive{
    protected double extraBonus;
    public SuperExecutive(String eName, String eAddress, String ePhone,
                          String socSecNumber, double rate, double extraBonus){
        super(eName, eAddress, ePhone,
                socSecNumber, rate);
this.extraBonus = extraBonus;

    }

public double pay(){
        double payment = super.pay()+extraBonus;
        extraBonus = 0;
        return payment;
}
    @Override
    public void addHours(double h) {
       payRate=payRate+h-h;
    }

    @Override
    public void awardBonus(double d) {
        payRate=payRate+d-d;
    }
}



