package com.company;

public class Trekant {
    private int a;
    private int b;
    private int c;
    public Trekant (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public String type(){
        if (a+b <= c || b+c <= a || a+c <=b){
            return "ikke gyldig trekant";
        }else if (a==b && b==c){
            return "detter er en lige sidet trekant";
        }else if (a==b ||a==c ||b==c){
            return "detter er en lige benet trekant";
        } else {
            return "detter er en vilkårlig trekant";
        }
    }

}
