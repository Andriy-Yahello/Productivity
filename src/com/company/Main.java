package com.company;

public class Main {

    public static void main(String[] args) {
            int N = 9999999;
        long t;
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i -- >0 ;)  {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis()-t);
        }


        {
            StringBuilder sbr = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i -->0 ;) {
                sbr.append("");
            }
            System.out.println(System.currentTimeMillis()-t);
        }
    }
}
