// for Code Studio platform solution 

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) // parameter in the form of ArrayList with same return type
	{
		// Write your code here.
        if(permutation == null || permutation.size() <=1) return permutation;
        int i = permutation.size()-2;
        
        while(i>=0 && permutation.get(i) >= permutation.get(i+1)) i--;
        if(i>=0)
        {
            int j = permutation.size()-1;
            while(j>0 && permutation.get(j) <= permutation.get(i)) j--;
            swap(permutation,i,j);
        }
        reverse(permutation, i+1 ,permutation.size()-1);
        return permutation;
	}
    
	
	
        public static void swap(ArrayList<Integer> permutation, int i, int j) {
    int tmp = permutation.get(i);
    permutation.set(i, permutation.get(j) );
    permutation.set(j , tmp);
}

public static void reverse(ArrayList<Integer> permutation, int i, int j) {
    while(i < j) swap(permutation, i++, j--);
}
}




