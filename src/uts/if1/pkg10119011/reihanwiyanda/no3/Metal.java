/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119011.reihanwiyanda.no3;

/**
 *
 * @author Reihan Wiyanda
 */
public class Metal extends HardRock implements HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.print("");
    }
    
    @Override
    public void genreHeavyMetal (String artistName) {
        System.out.print("METALICA adalah musisi Heavy Metal");
    }
    
    @Override
    public void genrePunk (String artistName) {
        System.out.print("MXPX adalah musisi Punk");
    }
    
    public void genreGrunge (String artistName) {
        
    }
}
