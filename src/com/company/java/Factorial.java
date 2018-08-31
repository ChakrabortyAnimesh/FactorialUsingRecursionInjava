package com.company.java;

public class Factorial {
    int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int result= n * fact(n - 1);
        return result;
    }

}
