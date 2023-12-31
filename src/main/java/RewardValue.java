public class RewardValue {
    private double cashValue = 0;
    private double milesValue = 0;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue/0.0035;
    }
    public RewardValue(String a, double milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue*0.0035;
    }

    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }
}
