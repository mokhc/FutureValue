package FutureValue;

//@mokhc
// program demonstrates the determination of future value used in financial calculation

import java.io.PrintStream;

class FV {
    //variables
    int period;
    double principle, rate;
    double nume, deno, mul;

    //constructor
    public FV(){
    }

    //constructor
    //with parameters
    public FV(int period, double principle, double rate){
        //get value and calculate
        this.period = period;
        this.principle = principle;
        this.rate = rate;
        //used to determine the multiplier
        nume = (period/rate)*Math.pow((1+rate),period);
        deno = period/rate;
        mul = nume/deno;
    }

    //method to determine FV
    public void GetFutureValue(){
        PrintStream ps = System.out;
        double value;
        value = mul*principle;
        ps.println("The FV for period "+period+" with principle "+principle+" and rate "+rate+" is "+value);
    }

    //method to determine FV
    //with parameters
    public void GetFutureValue(int period, double principle, double rate){
        PrintStream ps = System.out;
        //get value and calculate
        this.period = period;
        this.principle = principle;
        this.rate = rate;
        //used to determine the multiplier
        nume = (period/rate)*Math.pow((1+rate),period);
        deno = period/rate;
        mul = nume/deno;
        double value;
        value = mul*principle;
        ps.println("The FV for period "+period+" with principle "+principle+" and rate "+rate+" is "+value);
    }
}

class FutureValue {
    public static void main(String[] args){
        FV fv1 = new FV(1,1000,0.05);
        fv1.GetFutureValue();
        FV fv2 = new FV();
        fv2.GetFutureValue(2,1000,0.05);
    }
}
