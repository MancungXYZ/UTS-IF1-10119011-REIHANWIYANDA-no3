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
public class HardRock implements PsychedelicRock, ProgressiveRock, PopRock {
    public void genreHardRock (String artistName) {
        
    }
    
    @Override
    public void genrePopRock (String artistName) {
        System.out.print("Kiss adalah musisi PopRock");
    }
    
    @Override
    public void genrePsycehedellic (String artistName) {
        System.out.print("The Doors adalah musisi PsychedellicRock");
    }
    
    @Override
    public void genreProgressiveRock (String artistName) {
        System.out.print("DreamTheater adalah Musisi ProgressiveRock");
    }
    
    
}
