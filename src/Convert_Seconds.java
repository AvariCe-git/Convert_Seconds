// Antonios Giannakopoulos
import java.util.Scanner;

public class Convert_Seconds {
    public static void main(String[] args) throws Exception {
        double years, months, days, hours, minutes, seconds;
        Scanner i = new Scanner(System.in);
        System.out.println("Give a value in seconds");
        double input = i.nextDouble();

        minutes = input / 60;
        hours   = minutes / 60;
        days    = hours / 24;
        months  = days / 30.436768;
        years   = days/365;
        
        seconds = input % 60;
        minutes = minutes % 60;
        hours   = hours % 24;
        days    = days % 30.436768;
        months = months % 12;

        if (years >= 1 ){
            System.out.println(String.format("%.0f",input) +" seconds are broken down into " 
            + String.format("%.0f",Math.floor(years)) + " years, " 
            + String.format("%.0f",months) + " months, " 
            + String.format("%.0f",days) + " days, "
            + String.format("%.0f",hours) + " hours, " 
            + String.format("%.0f",minutes)+ " minutes and "
            + String.format("%.0f",seconds)+ " seconds");
        }
        if (months >= 1){
            System.out.println(String.format("%.0f",input) +" seconds are broken down into " 
            + String.format("%.0f",months) + " months, " 
            + String.format("%.0f",days) + " days, "
            + String.format("%.0f",hours) + " hours, " 
            + String.format("%.0f",minutes) + " minutes and "
            + String.format("%.0f",seconds)+ " seconds");       
        }
        else if (days >= 1){
            System.out.println(String.format("%.0f",input) +" seconds are broken down into "  
            + String.format("%.0f",days) + " days, "
            + String.format("%.0f",hours) + " hours, " 
            + String.format("%.0f",minutes) + " minutes and "
            + String.format("%.0f",seconds)+ " seconds");         
        }

        else if (hours >= 1){
            System.out.println(String.format("%.0f",input) +" seconds are broken down into "  
            + String.format("%.0f",hours) + " hours, " 
            + String.format("%.0f",minutes) + " minutes and "
            + String.format("%.0f",seconds)+ " seconds");             
        }
        else if (minutes >= 1){
            System.out.println(String.format("%.0f",input) +" seconds are broken down into "  
            + String.format("%.0f",minutes) + " minutes and "
            + String.format("%.0f",seconds)+ " seconds");       
        }
        else{
            System.out.println("Your input was garbage");
        }
    }
}