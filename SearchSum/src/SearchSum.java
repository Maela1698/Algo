
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M.Andriamahery
 */
public class SearchSum {
     public static boolean serchSum(List<Integer> N,Integer n){
        Set<Integer> complements = new HashSet<>();
        for(int x : N){
            if(complements.contains(n - x)){
                return true;
            }
            complements.add(x);
        }
        return false;
    }
    
    public static boolean searchSumM(List<Integer> N,Integer n){
        for(int x : N){
            if(N.contains(n - x)){
                return true;
            }   
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> N = new ArrayList<>();
        
        for (int i = 0; i < 100000; i++) {
            N.add(i);
        }
        
        int n = 1872652;
        boolean val = SearchSum.serchSum(N, n);
        System.out.println(val);
        boolean val2 = SearchSum.searchSumM(N, n);
        System.out.print(val2);
    }
}
