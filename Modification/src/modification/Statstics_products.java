/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modification;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Statstics_products {
    
    Database DB=new Database();
    public String Products_max() throws IOException{
    
    File file = new File("SoldProducts.txt"); 
    char M='M';
String name=DB.Sort('M', file);
	return name;
        
        
	}
    
    
    public String Products_min() throws FileNotFoundException, IOException{
    
 
    File file = new File("SoldProducts.txt"); 
    char M='m';
String name=DB.Sort('m', file);
	return name;
}}