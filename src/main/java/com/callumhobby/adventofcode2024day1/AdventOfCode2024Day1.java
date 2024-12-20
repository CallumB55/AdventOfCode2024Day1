/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.callumhobby.adventofcode2024day1;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CallumBinns
 */
public class AdventOfCode2024Day1 {

    public static void main(String[] args) {
        File file = new File("src\\main\\java\\input.txt");
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        Map<Integer,Integer> multiplierCollection = new HashMap<>();
        Integer rightNum;
        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String[] ln = scan.nextLine().split("\\s+");
                left.add(Integer.valueOf(ln[0]));
                rightNum =Integer.valueOf(ln[1]);
                right.add(rightNum);
                multiplierCollection.merge(rightNum,1,Integer::sum);
                
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        Collections.sort(left);
        Collections.sort(right);
        Integer totalDistance = 0;
        Integer similarityScore = 0;
        for (int i = 0; i < left.size(); i++) {
            totalDistance += Math.abs(left.get(i)-right.get(i));
            similarityScore += left.get(i)* multiplierCollection.getOrDefault(left.get(i), 0);
        }
        System.out.println("Total Distance:"+Integer.toString(totalDistance)+" Similarity Score:"+Integer.toString(similarityScore));
    }
}
