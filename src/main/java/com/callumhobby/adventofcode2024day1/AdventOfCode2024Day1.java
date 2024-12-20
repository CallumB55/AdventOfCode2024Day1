/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.callumhobby.adventofcode2024day1;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.TreeMap;

/**
 *
 * @author CallumBinns
 */
public class AdventOfCode2024Day1 {

    public static void main(String[] args) {
        File file = new File("src\\main\\java\\input.txt");
        TreeSet<Integer> right = new TreeSet<>(); //use of bsts results in more lines but a more interesting solution
        TreeMap<Integer, Integer> lists = new TreeMap<>();
        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String[] ln = scan.nextLine().split("   ");
                right.add(Integer.valueOf(ln[1]));
                lists.put(Integer.valueOf(ln[0]),null);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        

        System.out.println("Hello World!");
    }
}
