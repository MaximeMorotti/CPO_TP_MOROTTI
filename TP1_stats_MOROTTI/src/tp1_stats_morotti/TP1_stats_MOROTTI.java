/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_morotti;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author 33768
 */
public class TP1_stats_MOROTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        Random rd;
        double pr;
        sc = new Scanner(System.in);
        rd = new Random();
        DecimalFormat df = new DecimalFormat("#0.00");
        int[] tableauDes = new int[6];
        int m;
        for (int i = 0; i < tableauDes.length; i++) {
            tableauDes[i] = 0;
        }
        System.out.println("Donner moi un nombre");
        m = sc.nextInt();
        for (int y = 0; y < m; y++) {
            int res_launch = rd.nextInt(6);
            tableauDes[res_launch]++;
        }
        for (int z = 0; z < tableauDes.length; z++) {
            int nb = z + 1;
            System.out.println("Face " + nb + " : " + tableauDes[z] + " fois");
        }
        
        System.out.print("|");
        for (int a = 0; a < tableauDes.length; a++) {
            pr = ((double) tableauDes[a] *100 / m);
            String fpr = df.format(pr);
            System.out.print(fpr +"% |");
        }
    

    }
    
}
