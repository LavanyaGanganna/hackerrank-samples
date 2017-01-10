package com.lavanya.examples;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

/**
 * Created by lavanya on 1/8/17.
 */
class Calculate{
    Scanner scanner=new Scanner(System.in);
    //public Calculate output=new Calculate();
    Innerclass output=new Innerclass();
    class Innerclass{
        void display(double v){
            System.out.printf("%.3f\n",v);
        }

    }

    int get_int_val(){

        int testcnt=scanner.nextInt();
       // scanner.nextLine();
        return testcnt;
    }
    double get_double_val(){
        // Scanner scanner=new Scanner(System.in);
        double testnum=scanner.nextDouble();
        // scanner.nextLine();
        return testnum;
    }
    static Calculate do_calc(){

        return new Calculate();
    }
    double get_volume(int side) throws IOException{
        if(side<=0){
            throw new NumberFormatException("All the values must be positive");
        }
        double volumecal=(double)Math.pow(side,3);
        volumecal=Math.round(volumecal * 1000.0)/1000.0;
        return volumecal;
    }
    double get_volume(int l,int b,int h){
        if(l<=0 || b<=0 || h<=0){
            throw new NumberFormatException("All the values must be positive");
        }
        double volumecal=(double)l * b* h;
        volumecal=Math.round(volumecal * 1000.0)/1000.0;
        return volumecal;
    }
    double  get_volume(double r){
        if(r<=0){
            throw new NumberFormatException("All the values must be positive");
        }
        else{
            double volumecal=(2/3.0)*Math.PI*r*r*r;
            volumecal=Math.round(volumecal * 1000.0)/1000.0;
            return volumecal;
        }
    }
    double  get_volume(double r,double h) {
        if(r<=0 || h<=0){
            throw new NumberFormatException("All the values must be positive");

        }
        else{
            double volumecal=Math.PI*r*r*h;
            volumecal=Math.round(volumecal * 1000.0)/1000.0;
            return volumecal;
        }
    }


}

public class Shapevolumeex {
    public static void main(String[] args) {
        DoNotTerminates.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T--> 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    } //end of main
}
class DoNotTerminates {

    public static class ExitTrappedException extends SecurityException {}

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
} //end of Do_Not_
