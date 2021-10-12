/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class Zadanie4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
int[] usernum = new int[100];
int maximum=100,minimum=1;
int num=1;
for (int i = 0; i < 100; i++){
    Random random = new Random();

    if(maximum % 2 == 1)
    maximum = maximum + 1;

    int range = (maximum - minimum + 1) / 2;
    usernum[i] = random.nextInt(range) * 2 + minimum;

}
    int x=0;
    Arrays.sort(usernum);

    for (int i = 0; i < usernum.length; i++) {
        System.out.printf("%4d",usernum[i]);
        x++;
        if (x==10){
            System.out.println();
            x=0;
        }

    }
int summa = 0;
for (int i = 0; i < usernum.length; i++) {
    summa = summa + usernum[i];
    }
int numto=summa/10;
    System.out.println("  среднее арифметическое:"+numto);
}
}

