package dev.arturo.models;

public class AmstrongNumber {
    public String calcIfIsAmstrongNumber(Integer numb){
        String numbToString = numb.toString();
        int numbLength = numbToString.length();
        int sum = 0;

        for (int i = 0; i < numbLength; i++) {
            char digitChar = numbToString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += Math.pow(digit, numbLength);
        }

        if (numb.equals(sum)) {
            return numbToString + " "+ "Is an Armstrong Number!!!";
        } 
        return "Not an Armstrong Number: " + numbToString;
        
    }

    
}