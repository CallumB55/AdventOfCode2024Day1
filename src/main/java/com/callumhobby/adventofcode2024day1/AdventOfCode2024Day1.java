/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.callumhobby.adventofcode2024day1;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.Iterator;

/**
 *
 * @author CallumBinns
 */
public class AdventOfCode2024Day1 {

    public static void main(String[] args) {
        File file = new File("src\\main\\java\\input.txt");
        TreeSet<Integer> left = new TreeSet<>();
        TreeSet<Integer> right = new TreeSet<>(); 
        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String[] ln = scan.nextLine().split("   ");
                left.add(Integer.valueOf(ln[0]));
                right.add(Integer.valueOf(ln[1]));
                
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        Iterator<Integer> leftIt = left.iterator();
        Iterator<Integer> rightIt = right.iterator();
        Integer totalDistance = 0;
        Integer iterationCount = 0;
        while (leftIt.hasNext() && rightIt.hasNext()) {
            totalDistance += Math.abs(leftIt.next()-rightIt.next());
            iterationCount ++;
        }
        

        System.out.println(totalDistance);
        System.out.println(iterationCount);
        System.out.println(Integer.toString(right.size()));
    }
}
