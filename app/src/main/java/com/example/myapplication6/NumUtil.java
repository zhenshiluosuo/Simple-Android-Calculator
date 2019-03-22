package com.example.myapplication6;

public class NumUtil {
    public double toDouble(String str){
        return 0.0;
    }
    public String _tv(double x){
        double t = x - (int) x;
        if(t < 0)
            t = -t;
        if(t < 0.00000001)
            return String.valueOf((int)x);
        else{
            String temp = String.format("%.7f", x);
            for(int i = temp.length() -1; i >= 0; i--){
                if(temp.substring(i,i+1).equals("0")){
                    continue;
                }else{
                    if(i + 1 < temp.length()){
                        temp = temp.substring(0,i+1);
                    }
                    break;
                }
            }
            return temp;
        }

    }
}
