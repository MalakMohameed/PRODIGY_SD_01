package temperature.converter;

public class TemperatureConverter {

    public static void main(String[] args) {
       
    }
    


public double FtoC(double input){
    return (input-32)*(5.0/9.0);
}
public double FtoK(double input){
   return (input-32)*(5.0/9.0) + (273.15);
}


public double CtoF(double input){
    return (input * (9.0/5.0) + 32) ;
}
public double CtoK(double input){
    return input + 273.15;
}


public double KtoF(double input) {
    return (((input - 273.15) * (9.0 / 5.0)) + 32);
}
public double KtoC(double input){
    return (input - 273.15);
}

}