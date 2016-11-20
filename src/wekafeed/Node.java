/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekafeed;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author CXXXV
 */
public class Node {
  public static int lastID = 0;
  public static long seed = System.currentTimeMillis();
  public static Random rand = new Random(seed);
  
  public int id;
  public double value;
  public double eror;
  public Map<Integer, Double> edges = new HashMap<Integer, Double>();
  
  Node(){
    id = lastID;
    lastID++;
    value = rand.nextDouble();
  }
    
}
