package LicenseKeyFormatting;

public class Solution {
    static public String LicenseKeyFormatting(String LicenseKey , int k ){
        LicenseKey = LicenseKey.replace("-", "") ; 
        LicenseKey = LicenseKey.toUpperCase(); 
        int firstGroupLength = LicenseKey.length() % k ;
        int numberGroups = LicenseKey.length() / k ;
        String Result = LicenseKey.substring(0, firstGroupLength);
        
        for (int i = 0 ; i < numberGroups ; i ++ ){
            Result = Result + "-"+LicenseKey.substring(i*k + firstGroupLength , (i+1) * k + firstGroupLength);
        }
        return Result; 
    }
    static public void main(String [] args ){
        String s = "5F3Z-2e-9-w"; 
        String result = LicenseKeyFormatting(s, 3);
        System.out.println(result);
    }


}
