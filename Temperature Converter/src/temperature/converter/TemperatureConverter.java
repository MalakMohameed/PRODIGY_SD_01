package temperature.converter;

public class TemperatureConverter {

    public static void main(String[] args) {
       
    }
    
    
 public double converter(double temperature,String inputUnit, String outputUnit){
     if(inputUnit == "°C" && outputUnit == "°F"){
        return CtoF(temperature);
     }
     else if(inputUnit == "°C" && outputUnit == "°K"){
         return CtoK(temperature);
     }
     else if(inputUnit == "°F" && outputUnit == "°C"){
         return FtoC(temperature);
     }
     else if(inputUnit == "°F" && outputUnit == "°K"){
         return FtoK(temperature);
     }
     else if(inputUnit == "°K" && outputUnit == "°C"){
         return KtoC(temperature);
     }
     else if(inputUnit == "°K" && outputUnit == "°F"){
         return KtoF(temperature);
     }
     else if(inputUnit == outputUnit){
         return temperature;
     }
        return 0;
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