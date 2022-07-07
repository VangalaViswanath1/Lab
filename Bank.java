
class Bank{
    public float getRateOfIntrest(){
        return 0;
    }
}

class SBI extends Bank{
    public float getRateOfIntrest(){
        return 8;
    }
}
class ICICI extends Bank{
    public float getRateOfIntrest(){
        return 7;
    }
}

class AXIS extends Bank{
    @Override
    public float getRateOfIntrest(){
        return 9;
    }
}




public class Bank{
    public static void main(String args[]){
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("SBI interest rate of is :"+ sbi.getRateOfIntrest());
        System.out.println("ICICI interest rate of is :"+ icici.getRateOfIntrest());
        System.out.println("AXIS interest rate of is :"+ axis.getRateOfIntrest());
    }
}
