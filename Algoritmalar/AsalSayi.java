package com.company;
import java.util.ArrayList;
public class AsalSayi {

    public void asal(int sayi){
        boolean karar=false;
        ArrayList<Integer>x=new ArrayList<>();
        for (int i = 2; i <sayi ; i++) {
            for (int j = 2; j < i; j++) {
                if (j % i == 0) {
                    karar = false;
                } else {
                    karar = true;
                    if (karar == true)
                        x.add(i);
                }
            }
        }
        System.out.println(x);
    }
}
